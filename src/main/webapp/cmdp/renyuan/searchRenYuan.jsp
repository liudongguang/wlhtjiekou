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

<title><s:property value="#session.qtjg.name" />人力统计报表</title>

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
	src="<%=basePath%>My97DatePicker/WdatePicker.js">
</script>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>

<script type="text/javascript">
function changePage(currentPage) {
	document.form1.action = "<%=basePath%>cmdphd/getAllHospitalMan?currentPageNum="
			+ currentPage;
	document.form1.submit();
}
	$(document).ready(function() {
		$("#addNewRLInfoBt").click(function(){
		    window.location.href="<%=basePath%>cmdp/renyuan/addRenYuan.jsp";
		});
	});
</script>
<script type="text/javascript" src="<%=basePath%>js/jsUtil.js"></script>
<script type="text/javascript" src="<%=basePath%>cmdp/js/renyuan.js"></script>

</head>
<body class="bj ss">
<input id="basePH" type="hidden" value="<%=basePath%>" />
	<input type="hidden" id="getZidianStr" value="addrongyuInfo" />
     <form action="" name="form1" method="post">
	<table width="95%" cellspacing="0" border="0" cellpadding="0"
		class="formTable">
		<tr>
		   <td>医师姓名：<input type="text" name="searRY.ysName" value="<s:property value="searRY.ysName"/>"/> </td>
		   <td>身份证号：<input type="text" name="searRY.cardId" value="<s:property value="searRY.cardId"/>"/> </td>
		   <td>所在科室：<input id="jiansuo_szks" name="searRY.suozaiksName" value="<s:property value="searRY.suozaiksName"/>" class="input"
					style='width: 100px'>
					<div></div>
					<div id="search_suggest_jiguan" class="serchDIV"></div> <input 
					type="hidden" value="<s:property value="searRY.suozaiksbm"/>"
					id="szks_hide" name='searRY.suozaiksbm'> </td>
		</tr>
		<tr>
			<td align="right" colspan="3">
			<input type="submit" value=""
				id="searchBT"
				style=" width:50px; height:20px;  border:0; background:url(<%=basePath%>images/dl_110.png) no-repeat left top" />
			<input type="button" value=""
				id="addNewRLInfoBt"
				style=" width:50px; height:20px;  border:0; background:url(<%=basePath%>images/dl_102.png) no-repeat left top" />
			</td>
		</tr>
	</table>
	</form>
	<table width="95%" cellspacing="0" border="0" cellpadding="0"
		class="formTable">
		<tr>
			<td align="center">医师姓名</td>
			<td align="center">所在科室</td>
			<td align="center">身份证号</td>
			<td align="center">出生日期</td>
			<td align="center">参加工作时间</td>
			
			<!--  <td align="center">是否启用</td>
			
			-->
			<td align="center" width="10%">操作</td>
		</tr>
		<s:iterator value="pageList" var="ys">
			<tr align="center">
				<td align="center"><s:property value="#ys.ysname"/></td>
			<td align="center"><s:property value="#ys.suozaiks"/></td>
			<td align="center"><s:property value="#ys.idcard"/></td>
			<td align="center"><s:date name="#ys.birthday" format="yyyy-MM-dd"/> </td>
			<td align="center"><s:date name="#ys.workday" format="yyyy-MM-dd"/> </td>
			
			<!-- 
			<td align="center"><s:property value="#ys.sfqy"/></td>
				<a target="_top"
					href="<%=basePath%>weist/getHlminfoByID?handlerId=<s:property value="#ylqx.id"/>">详情</a>
					<a
					href="<%=basePath%>weist/delHlminfoByID?handlerId=<s:property value="#ylqx.id"/>">删除</a>
				
				 -->
				 <td>
				 <a 
					href="<%=basePath%>cmdphd/getYSinfoByID?handlerId=<s:property value="#ys.id"/>">修改</a>
					
					 <a 
					href="<%=basePath%>cmdphd/delYSinfoByID?handlerId=<s:property value="#ys.id"/>">删除</a>
					</td>
			</tr>
		</s:iterator>
	</table>
	<%
		if (request.getAttribute("pageTotalCount") == null) {

		} else {

			int pageSize = (Integer) request.getAttribute("pageSize");
			long allCount = (Long) request.getAttribute("totalCount");
			long pageCode = (Long) request.getAttribute("currentPageNum");
			long pageCount = (Long) request.getAttribute("pageTotalCount");
	%>
	<div class="tac">
		<span>记录数：<%=allCount%></span> <a style="padding: 4px 10px 3px;"
			class="fy hand <%=pageCode == 1 ? "hide" : ""%>"
			onclick="changePage(<%=pageCode - 1%>)">上一页</a> <a
			style="padding: 4px 10px 3px;"
			class="fy hand <%=(pageCode == 1) || (pageCode == 2) || (pageCode == 3) ? "hide"
						: (pageCount > 6 ? "" : "hide")%>"
			onclick="changePage(1)">1...</a> <a
			class="fy hand <%=pageCount > 6 ? ((pageCode - 5 > 0) && (pageCode < 4))
						|| (pageCode + 1 > pageCount) ? "" : "hide"
						: pageCode - 5 > 0 ? "" : "hide"%>"
			onclick="changePage(<%=pageCode - 5%>)"><%=pageCode - 5%></a> <a
			class="fy hand <%=pageCount > 6 ? ((pageCode - 4 > 0) && (pageCode < 4))
						|| (pageCode + 2 > pageCount) ? "" : "hide"
						: pageCode - 4 > 0 ? "" : "hide"%>"
			onclick="changePage(<%=pageCode - 4%>)"><%=pageCode - 4%></a> <a
			class="fy hand <%=pageCount > 6 ? ((pageCode - 3 > 0) && (pageCode < 4))
						|| (pageCode + 3 > pageCount) ? "" : "hide"
						: pageCode - 3 > 0 ? "" : "hide"%>"
			onclick="changePage(<%=pageCode - 3%>)"><%=pageCode - 3%></a> <a
			class="fy hand <%=pageCode - 2 > 0 ? "" : "hide"%>"
			onclick="changePage(<%=pageCode - 2%>)"><%=pageCode - 2%></a> <a
			class="fy hand <%=pageCode - 1 > 0 ? "" : "hide"%>"
			onclick="changePage(<%=pageCode - 1%>)"><%=pageCode - 1%></a> <a
			class="fy2 hand"><%=pageCode%></a> <a
			class="fy hand <%=(pageCode + 1) > pageCount ? "hide" : ""%>"
			onclick="changePage(<%=pageCode + 1%>)"><%=pageCode + 1%></a> <a
			class="fy hand <%=(pageCode + 2) > pageCount ? "hide" : ""%>"
			onclick="changePage(<%=pageCode + 2%>)"><%=pageCode + 2%></a> <a
			class="fy hand <%=(pageCode + 3) > pageCount ? "hide" : ""%>"
			onclick="changePage(<%=pageCode + 3%>)"><%=pageCode + 3%></a> <a
			class="fy hand <%=pageCount > 6 ? ((pageCode + 4) <= 6) ? "" : "hide"
						: (pageCode + 4) > pageCount ? "hide" : ""%>"
			onclick="changePage(<%=pageCode + 4%>)"><%=pageCode + 4%></a> <a
			class="fy hand <%=pageCount > 6 ? ((pageCode + 5) <= 6) ? "" : "hide"
						: (pageCode + 5) > pageCount ? "hide" : ""%>"
			onclick="changePage(<%=pageCode + 5%>)"><%=pageCode + 5%></a> <a
			class="fy hand <%=((pageCode + 3) < pageCount || pageCode < 2)
						&& pageCount > 6 ? "" : "hide"%>"
			onclick="changePage(<%=pageCount%>)"><%="..." + pageCount%></a> <a
			style="padding: 4px 10px 3px;"
			class="fy hand <%=pageCount == pageCode || allCount < pageSize ? "hide"
						: ""%>"
			onclick="changePage(<%=pageCode + 1%>)">下一页</a>
	</div>
	<%
		}
	%>
</body>
</html>



