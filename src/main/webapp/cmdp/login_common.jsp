<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="健康云" />
<meta name="description" content="排版日期：2010/01/18" />
<meta name="author" content="lichao" />
<meta content="all" name="robots" />
<title><s:property value="#session.qtjg.name" />医院维护登陆</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/guest.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/user.css" />
<script language="javascript" src="<%=basePath%>js/validateCode.js">
	
</script>
<script type="text/javascript">
	function fh() {
		history.back(1);
	}
</script>
</head>

<body class=" bkf8">
	<input type="hidden" value="<%=basePath%>" id="basePath" />
	<form action="<%=basePath%>cmdphd/commonLoginJump" name="form1"
		method="post">
		<div class="u_login front">
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				class="tab_list01">
				<tr>
					<td width="30%" class="txtRight b"></td>
					<td width="20%" class="txtRight b color1 dltd">用户名：</td>

					<td width="50%"><input type="text" id="user" name="czy.name"
						class="input_format16 w180" />
					</td>
				</tr>
				<tr>
					<td width="20%" class="txtRight b"></td>
					<td class="txtRight b color1 dltd">
						密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>

					<td><input type="password" id="pass" name="czy.password"
						class="input_format16 w180" />
					</td>
				</tr>


				<tr>
					<td width="20%" class="txtRight b"></td>
					<td width="12%" height="30" class="txtRight b color1 dltd">
						验证码：</td>

					<td width="32%" nowrap="nowrap"><input type="text"
						id="seccode" name="validateCode"
						class="input_format16 w100 absmid" /> &nbsp;&nbsp;&nbsp; <img
						src="<%=basePath%>myutil/createValidateAction" id="sec"
						onclick="clchangeCode()" /> <a onclick="clchangeCode()"
						class="hand">刷新</a>
						<p>
							<s:actionmessage />
						</p>
					</td>
					<td width="54%" valign="top"><span id="span_yzm"></span>
					</td>
				</tr>

				<tr>
					<td class="txtRight">&nbsp;</td>
					<td class="orange"></td>
					<td><input type="submit" value=""
						style=" width:70px; height:30px;  border:0; background:url(<%=basePath%>images/dl_1.png) no-repeat left top" />
						<input type="reset" value=""
						style=" width:70px; height:30px;  border:0; background:url(<%=basePath%>images/dl_2.png) no-repeat left top" />
						<input type="button" value="" onclick="fh()"
						style=" width:70px; height:30px;  border:0; background:url(<%=basePath%>images/dl_3.png) no-repeat left top" />
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
