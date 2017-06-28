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

<title><s:property value="#session.qtjg.name" />医院设置</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->

<link rel="stylesheet" type="text/css" href="css/global.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<script language="javascript" type="text/javascript"
	src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/dh.js"></script>
<script type="text/javascript">
	function loadContent(url) {
		$("#mainContent").attr("src", url);
	}
</script>
</head>
<body>
	<div class="main_content">
		<jsp:include page="/biaoti/top.jsp" />
		<div class="top">
			<input id="basePath" type="hidden" value="<%=basePath%>">
		</div>
		<!-- 頭部部分結束 -->

		<!-- 內容部分開始 -->
		<div class="center">

			<div id="leftMenu">
				<div class="menu_title">
					<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数据设置</span>
				</div>
				<div>
					<ul>
						<li class="main"><a>信息管理</a>
							<ul class="csa">
								<li onmouseover="this.style.background='#e7f4fa'"
									onmouseout="this.style.background='#FFF';"><a
									hidefocus="true"
									onclick="loadContent('<%=basePath%>cmdphd/getAllHospitalOffice')">科室设置</a>
								</li>
								<li onmouseover="this.style.background='#e7f4fa'"
									onmouseout="this.style.background='#FFF';"><a
									hidefocus="true"
									onclick="loadContent('<%=basePath%>cmdphd/getAllHospitalMan')">医师设置</a>
								</li>
								<li onmouseover="this.style.background='#e7f4fa'"
									onmouseout="this.style.background='#FFF';"><a
									hidefocus="true"
									onclick="loadContent('<%=basePath%>/index.jsp')">数据导入</a>
								</li>
							</ul>
					</ul>
				</div>
			</div>
			<div class="sl-shadow formWrapper" id="showDIV">
				<input type="hidden" id="basy" />
				<center>
					<iframe border=0 id="mainContent"
						src="<%=basePath%>cmdphd/getAllHospitalOffice.action" name="mainContent"
						marginwidth=0 framespacing=0 frameborder="0" noResize width="100%"
						scrolling="auto" height="100%" vspale="0" onLoad="iFrameHeight()">
					</iframe>
				</center>
				<script type="text/javascript" language="javascript">
					function iFrameHeight() {
						var ifm = document.getElementById("mainContent");
						var subWeb = document.frames ? document.frames["mainContent"].document
								: ifm.contentDocument;
						if (ifm != null && subWeb != null) {
							ifm.height = subWeb.body.scrollHeight;
						}
					}
				</script>
			</div>
		</div>
		<div class="clear"></div>
		<!-- 內容部分結束 -->

	</div>
</body>
</html>
