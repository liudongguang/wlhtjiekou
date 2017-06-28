<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="javascript" type="text/javascript"
	src="<%=basePath%>My97DatePicker/WdatePicker.js">
	
</script>
</head>

<body>
	<!-- 
    This is my JSP page. <br>
    <a href="test/testJieKou">ceshi</a>
    <a href="test/testAdd">ceshi</a>
    <a href="test/testXLS">daoru</a>
    +++++++++++++++++<s:property value="tableName"/>
	<form action="<%=basePath%>myutil/getTableZiDuan" method="post">
	<select name="tableName">
	   <option value="temrbinganshouye_xiyi">基本</option>
	   <option value="TemrBingAnShouYeXiMu_ShouShu_Xiyi">手術</option>
	   <option value="TemrBingAnShouYeXiMu_ChuYuanZhenDuan_Xiyi">疾病</option>
	</select>
	<input type="submit" value="获取表字段">
	</form>
	<a href="test/testXLS">daoru</a>
	  <a href="test/delChongFuBase">删除重复记录中最早的一条</a>
    -->
  
     <p>选择日期范围进行导入病案数据，已导入的数据部会再次导入！日期范围最大不要超过6个月！</p>
     <p style="color: red"><s:property value="HandlerStr"/></p>
	<form action="<%=basePath%>test/wlthDR" method="post">
		<input type="text" name="startDate" id="startTime"
			value="<s:date name="startDate"  format="yyyy-MM-dd"/>"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" /> - <input type="text" name="endDate"
			id="endTime" value="<s:date name="endDate"  format="yyyy-MM-dd"/>"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" />
		 <input type="submit" value="导入数据">
	</form><br/>
	
	  <p>选择日期范围进行导入费用数据，将没有费用的记录进行导入！日期范围最大不要超过3个月！</p>
     <p style="color: red"><s:property value="HandlerStrFY"/></p>
	<form action="<%=basePath%>test/wlthDRFY" method="post">
		<input type="text" name="startDate_fy" id="startTime_fy"
			value="<s:date name="startDate_fy"  format="yyyy-MM-dd"/>"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" /> - <input type="text" name="endDate_fy"
			id="endTime_fy" value="<s:date name="endDate_fy"  format="yyyy-MM-dd"/>"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" />
			<input type="checkbox" name="delFyState" value="1"/>删除已有费用
		 <input type="submit" value="导入数据"/>
	</form><br/>
	
</body>
</html>
