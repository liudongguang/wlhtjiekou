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

<title>消息提示</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/global.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body class="bj">
	<center>
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
		<s:actionmessage cssClass="cwxx" />
		<s:if test="#session.qtjg.picbj==null">
			<img src="images/tit_kf.jpg"></img>
		</s:if>
		<s:else>
			<img src="<%=basePath%>images/cmdp/xambj.jpg"></img>
		</s:else>
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
		<br /> <br /> <br />
		
	</center>
</body>
</html>
