<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>劳模五一劳动奖章等荣誉情报表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/global.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/tanchuxiala.css">
<script language="javascript" type="text/javascript"
	src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/jsUtil.js"></script>
<script type="text/javascript" src="js/addrongyu.js"></script>
</head>

<body class="bj ss printPage_bodyA4">
	<input id="basePH" type="hidden" value="<%=basePath%>" />
	<input type="hidden" id="getZidianStr" value="addrongyuInfo" />
	<input type="hidden" id="disInput" value="disry" />
	<!-- 
	<table width="95%" cellspacing="0" border="0" cellpadding="0"
		class="formTable">
		<tr>
			<td align="right"><input type="button" value="" id="forBackBt"
				style=" width:50px; height:20px;  border:0; background:url(<%=basePath%>images/dl_122.png) no-repeat left top" />
			</td>
		</tr>
	</table>
	 -->
	<table width="95%" cellspacing="0" border="0" cellpadding="0"
		class="formTable" >
		
	</table>
</body>
</html>
