<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="${pageContext.request.contextPath }/"/>
<title>数据处理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script language="javascript" type="text/javascript"
	src="assets/My97DatePicker/WdatePicker.js">
	
</script>
</head>

<body>
<span style="color: red">
   ${errmsg}
</span>
     <p>选择日期范围进行导入病案数据，已导入的数据部会再次导入！日期范围最大不要超过6个月！</p>
     <p style="color: red"></p>
	<form action="wlhtData/wlthDR" method="post">
		<input type="text" name="starte" id="startTime"
			value="${param.starte}"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" /> - <input type="text" name="end"
			id="endTime" value="${param.end}"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" />
		 <input type="submit" value="导入数据">
	</form><br/>
	
	  <p>选择日期范围进行导入费用数据，将没有费用的记录进行导入！日期范围最大不要超过3个月！</p>
     <p style="color: red">
	<form action="wlhtData/wlthDRFY" method="post">
		<input type="text" name="starte" value="${param.starte}"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" /> - <input type="text" name="end"
			id="end" value="${param.end}"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate input"
			style="width: 100px" />
			<input type="checkbox" name="delFyState" value="1"/>删除已有费用
		 <input type="submit" value="导入数据"/>
	</form><br/>
</body>
</html>
