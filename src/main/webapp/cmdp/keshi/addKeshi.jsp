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

<title>增加科室信息</title>

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
<script type="text/javascript" src="<%=basePath%>js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jsUtil.js"></script>
<script type="text/javascript" src="<%=basePath%>cmdp/js/keshi.js"></script>
</head>

<body class="bj ss">
	<input id="basePH" type="hidden" value="<%=basePath%>" />
	<input type="hidden" id="getZidianStr" value="addrongyuInfo" />

	<s:property value="errorStr" />
	<form action="<%=basePath%>cmdphd/saveKsInfo" name="form1"
		method="post" id="subRLForm" class="ss">
		<table width="95%" cellspacing="0" border="0" cellpadding="0"
			class="formTable">
			<tr>
				<td colspan="6" align="right"> 
				<input id="basePH" value="<%=basePath%>" type="hidden">
				<input id="zidianState" value="addKeshi.jsp" type="hidden">
				<s:property
						value="HandlerStateStr" />
						 <input type="button" value=""
					id="forBackBt"
					style=" width:50px; height:20px;  border:0; background:url(<%=basePath%>images/dl_122.png) no-repeat left top" />
					<input type="submit" value=""
					style=" width:50px; height:20px;  border:0; background:url(<%=basePath%>images/dl_101.png) no-repeat left top" />
				</td>
			</tr>
			<tr>
				<td width="20%" class="dark  red">*科室名称</td>
				<td >
				   <input id="unique_STDHOSPITALOFFICE_name" type="text" str name="keshi.mingcheng" value="<s:property value="keshi.mingcheng"/>"/>
				</td>
				<td  class="dark  red">*科室编码</td>
				<td >
				   <input id="unique_STDHOSPITALOFFICE_code" type="text" num name="keshi.keshiBM" value="<s:property value="keshi.keshiBM"/>"/>
				</td>
			</tr>
			<tr>
			<td  class="dark  red">*隶属国家标准</td>
				<td >
				<input id="jiansuo_biaozhunLiShu" value="" class="input"
					style='width: 100px'>
					<div></div>
					<div id="search_suggest_jiguan" class="serchDIV"></div> <input notnull
					type="hidden" value="<s:property value="keshi.biaozhunLiShu"/>"
					id="biaozhunLiShu_hide" name='keshi.biaozhunLiShu'>
				</td>
				<td  class="dark  red">*科室类型</td>
				<td >
				   <select notnull id="ksType_id" name="keshi.ksType">
				       <option value="">--请选择--</option>
				   </select>
				</td>
			</tr>
		</table>
	</form>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
</body>
</html>
