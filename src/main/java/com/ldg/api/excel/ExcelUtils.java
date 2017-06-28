package com.ldg.api.excel;

import com.ldg.api.util.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;

import javax.mail.internet.MimeUtility;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.*;

public class ExcelUtils<T> {
    public static <T> void createExcelWorkBook(Workbook workbook, List<T> data, Map<String, String> columns) {
        List<String> fields = new ArrayList<String>();
        List<String> heads = new ArrayList<String>();
        for (String key : columns.keySet()) {
            fields.add(key);
            heads.add(columns.get(key));
        }
        int rowNum = 0;
        ///// 创建表头
        Sheet sheet = workbook.createSheet();
        Row row = sheet.createRow(rowNum);
        setCellValue(heads, row);
        //sheet.autoSizeColumn(rowNum);
        rowNum++;
        /////
        for (T t : data) {
            row = sheet.createRow(rowNum);
            rowNum++;
            Class clazz = t.getClass();
            int cellNum = 0;
            for (String field : fields) {
                Field fl = null;
                try {
                    fl = clazz.getDeclaredField(field);
                } catch (NoSuchFieldException e) {
                    try {
                        fl = clazz.getSuperclass().getDeclaredField(field);
                    } catch (NoSuchFieldException e1) {
                        e1.printStackTrace();
                    } catch (SecurityException e1) {
                        e1.printStackTrace();
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                fl.setAccessible(true);
                Object objValue = null;
                try {
                    objValue = fl.get(t);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                setCellValue(objValue, row, cellNum);
                cellNum++;
            }
        }
        for (int i = 0; i < fields.size(); i++) {
            sheet.setColumnWidth(i, 20 * 256);
        }
    }

    private static <E> void setCellValue(List<E> list, Row row) {
        int cellNum = 0;
        for (E e : list) {
            Cell cell = row.createCell(cellNum);
            cellNum++;
            if (e == null) {
                continue;
            }
            String value = e.toString();
            cell.setCellValue(value);// 设置单元格内容
            // cell.setCellStyle(cellStyle);//设置单元格样式
            // cell.setCellType(HSSFCell.CELL_TYPE_STRING);//指定单元格格式：数值、公式或字符串
            // cell.setCellComment(comment);//添加注释

        }
    }

    private static void setCellValue(Object obj, Row row, int cellNum) {
        Cell cell = row.createCell(cellNum);
        if (obj != null) {
            if ("java.util.Date".equals(obj.getClass().getName())) {
                Date d = (Date) obj;
                cell.setCellValue(DateFormatUtils.format(d, DateUtil.yyyy_MM_dd));
            } else {
                cell.setCellValue(obj.toString());// 设置单元格内容
            }
        } else {
            cell.setCellValue("");// 设置单元格内容
        }
    }

    public static String getFileName(String fileNameSource, HttpServletRequest request) {
        /**
         * 获取客户端浏览器和操作系统信息 在IE浏览器中得到的是：User-Agent=Mozilla/4.0 (compatible; MSIE
         * 6.0; Windows NT 5.1; SV1; Maxthon; Alexa Toolbar)
         * 在Firefox中得到的是：User-Agent=Mozilla/5.0 (Windows; U; Windows NT 5.1;
         * zh-CN; rv:1.7.10) Gecko/20050717 Firefox/1.0.6
         */
        String agent = request.getHeader("USER-AGENT");
        try {
            if ((agent != null) && (-1 != agent.indexOf("MSIE"))) {
                String newFileName = URLEncoder.encode(fileNameSource, "UTF-8");
                newFileName = StringUtils.replace(newFileName, "+", "%20");
                if (newFileName.length() > 150) {
                    newFileName = new String(fileNameSource.getBytes("GB2312"), "ISO8859-1");
                    newFileName = StringUtils.replace(newFileName, " ", "%20");
                }
                return newFileName;
            }
            if ((agent != null) && (-1 != agent.indexOf("Mozilla"))) {
                return MimeUtility.encodeText(fileNameSource, "UTF-8", "B");
            }
            return fileNameSource;
        } catch (Exception ex) {
            return fileNameSource;
        }
    }

    public static List<List<String>> readExcel(String fileName) {
        Workbook workbook = null;
        Sheet sheet = null;
        InputStream in = null;
        List<List<String>> rtList = new ArrayList<>();
        try {
            ClassPathResource hospitalInterface = new ClassPathResource(fileName);
            in = hospitalInterface.getInputStream();

            if (fileName.toLowerCase().endsWith("xlsx")) {
                workbook = new XSSFWorkbook(in);
            } else if (fileName.toLowerCase().endsWith("xls")) {
                workbook = new HSSFWorkbook(in);
            }
            sheet = workbook.getSheetAt(0);
            //得到行的迭代器
            Iterator<Row> rowIterator = sheet.iterator();

            int rowCount = 0;
            //循环每一行
            while (rowIterator.hasNext()) {
                List<String> rowList = new ArrayList<>();
                System.out.print("第" + (rowCount++) + "行  ");

                //得到一行对象
                Row row = rowIterator.next();

                //得到列对象
                Iterator<Cell> cellIterator = row.cellIterator();

                int columnCount = 0;

                //循环每一列
                while (cellIterator.hasNext()) {
                    //System.out.print("第"+(columnCount++)+"列:  ");

                    //得到单元格对象
                    Cell cell = cellIterator.next();

                    //检查数据类型
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "   ");
                            rowList.add(cell.getStringCellValue().trim());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "   ");
                            rowList.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        default:
                            rowList.add("-1");
                    }
                } //end of cell iterator
                rtList.add(rowList);
                System.out.println();

            } //end of rows iterator
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rtList;
    }

    public static <T> List<T> readExcel(String fileName,Class<T> clazz) {
        Workbook workbook = null;
        Sheet sheet = null;
        InputStream in = null;
        List<T> rtList = new ArrayList<>();
        try {
            ClassPathResource hospitalInterface = new ClassPathResource(fileName);
            in = hospitalInterface.getInputStream();

            if (fileName.toLowerCase().endsWith("xlsx")) {
                workbook = new XSSFWorkbook(in);
            } else if (fileName.toLowerCase().endsWith("xls")) {
                workbook = new HSSFWorkbook(in);
            }
            sheet = workbook.getSheetAt(0);
            //得到行的迭代器
            Iterator<Row> rowIterator = sheet.iterator();
            int rowCount = 0;
            //循环每一行
            while (rowIterator.hasNext()) {
                T t=clazz.newInstance(); //创建新的对象
                Field[] fields=t.getClass().getDeclaredFields();
                //得到一行对象
                Row row = rowIterator.next();
                //得到列对象
                Iterator<Cell> cellIterator = row.cellIterator();
                int columnCount = 0;
                //循环每一列
                int fieldIndex=0;
                while (cellIterator.hasNext()) {
                    Field field=fields[fieldIndex];
                    field.setAccessible(true);
                    System.out.println(field.getName()+"    "+field.getType()+"    "+field.getGenericType());
                    fieldIndex++;
                    //得到单元格对象
                    Cell cell = cellIterator.next();
                    //检查数据类型
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                           // field.set(t,cell.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            //field.set(t,cell.getNumericCellValue());
                            break;
                    }
                }
                rtList.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rtList;
    }
}
