package com.test;

import com.ldg.api.excel.ExcelUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public class ReadXml {
    public static void main(String[] args) throws IOException {
        String tableName="hisview";
        List<List<String>> rslist=ExcelUtils.readExcel("首页数据.xls");
        StringBuilder create=new StringBuilder("create table hisview(");
        StringBuilder commentsbd=new StringBuilder();
        rslist.stream().skip(1).forEach(item->{
            String ziduan=item.get(0);
            String ziduanType=item.get(1);
            String comment=item.get(5);
            create.append(ziduan.toLowerCase()).append("  ").append(ziduanType).append(", \r\n");
            commentsbd.append("comment on column ").append(tableName).append(".").append(ziduan.toLowerCase()).append(" is ").append("'").append(comment).append("';\r\n ");
        });
        create.append(")");
       // System.out.println(create);
        System.out.println(commentsbd);
    }
}
