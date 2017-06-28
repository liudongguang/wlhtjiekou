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
		<tr>
		   <td colspan="6" align="center"><h2>劳模五一劳动奖章等荣誉情报表</h2></td>
		</tr>
		<tr>
			<td width="20%" class="dark">荣誉类型</td>
			<td colspan="5"><s:if test="hlminfo.id!=null">
					<input type="hidden" name="enterState" value="updatehlminfo">
				</s:if> <input type="hidden" id="hhhy_ID" name="hlminfo.id"
				value="<s:property value="hhyinfo.id"/>"> <select
				id="sel_rytype" name="hlminfo.rytype">
					<option value="">----请选择----</option>
			</select> <input type="hidden" id="input_rytype"
				value="<s:property value="hlminfo.rytype"/>" />
			</td>
		</tr>

		<tr>
			<td class="dark">获得荣誉时间</td>
			<td colspan="5"><s:date name="hlminfo.rytime"
					format="yyyy-MM-dd HH:mm:ss" />
			</td>
		</tr>
		<tr>
			<td class="dark">状态</td>
			<td><select id="sel_ryzt" name="hlminfo.ryzt">
					<option value="">----请选择----</option>
			</select> <input type="hidden" id="input_ryzt"
				value="<s:property value="hlminfo.ryzt"/>" /></td>
			<td class="dark">姓名</td>
			<td><s:property value="hlminfo.name" />
			</td>
			<td class="dark">性别</td>
			<td><select name="hlminfo.sex" id="sel_sex">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_sex"
				value="<s:property value="hlminfo.sex"/>" />
			</td>
		</tr>
		<tr>
			<td class="dark">身份证号</td>
			<td><s:property value="hlminfo.cardid" />
			</td>
			<td class="dark">政治面貌</td>
			<td><select name="hlminfo.zzmm" id="sel_zzmm">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_zzmm"
				value="<s:property value="hlminfo.zzmm"/>" />
			</td>
			<td class="dark">参加政党时间</td>
			<td><s:date name="hlminfo.rdtime" format="yyyy-MM-dd" />
			</td>
		</tr>
		<tr>
			<td class="dark">出生日期</td>
			<td><s:date name="hlminfo.cstime" format="yyyy-MM-dd" />
			</td>
			<td class="dark">民族</td>
			<td><select name="hlminfo.mz" id="sel_mz">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_mz"
				value="<s:property value="hlminfo.mz"/>" />
			</td>
			<td class="dark">籍贯</td>
			<td><s:if test="enterState=='readOnlyHlminfoByID'">
					<span id="jiansuo_jiguan"></span>
					<input type="hidden" value="<s:property value="hlminfo.jg"/>"
						id="bmJQ_jiguan" />
				</s:if> <s:else>
					<input id="jiansuo_jiguan" value="" class="input"
						style='width: 100px'>
					<div></div>
					<div id="search_suggest_jiguan" class="serchDIV"></div>
					<input type="hidden" value="<s:property value="hlminfo.jg"/>"
						id="bmJQ_jiguan" name='hlminfo.jg'>
				</s:else>
			</td>
		</tr>
		<tr>
			<td class="dark">婚姻状况</td>
			<td><select name="hlminfo.hy" id="sel_hy">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_hy"
				value="<s:property value="hlminfo.hy"/>" />
			</td>
			<td class="dark">学位</td>
			<td><select name="hlminfo.xw" id="sel_xw">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_xw"
				value="<s:property value="hlminfo.xw"/>" />
			</td>
			<td class="dark">学位专业</td>
			<td><s:property value="hlminfo.zy" />
			</td>
		</tr>
		<tr>
			<td class="dark">学历</td>
			<td><select name="hlminfo.xl" id="sel_xl">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_xl"
				value="<s:property value="hlminfo.xl"/>" />
			</td>
			<td class="dark">就业状况</td>
			<td><select name="hlminfo.jyzk" id="sel_jyzk">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_jyzk"
				value="<s:property value="hlminfo.jyzk"/>" />
			</td>
			<td class="dark">参加工作时间</td>
			<td><s:date name="hlminfo.cstime" format="yyyy-MM-dd" />
			</td>
		</tr>
		<tr>
			<td class="dark">离退休时间</td>
			<td><s:date name="hlminfo.lttime" format="yyyy-MM-dd" />
			</td>
			<td class="dark">工作单位</td>
			<td><s:property value="hlminfo.gzdw" />
			</td>
			<td class="dark">单位类型</td>
			<td><select id="sel_dwlx" name="hlminfo.dwlx">
						<option value="">----请选择----</option>
				</select> <input type="hidden" id="input_dwlx"
					value="<s:property value="hlminfo.dwlx"/>" />
			</td>
		</tr>
		<tr>
			<td class="dark">担任职务</td>
			<td><s:property value="hlminfo.drzw" />
			</td>
			<td class="dark">是否非在编人员</td>
			<td><input type="radio" name="hlminfo.sfzb" value="1" />是 <input
				type="radio" name="hlminfo.sfzb" value="0" checked="checked" />否 <input
				type="hidden" id="radio_sfzb"
				value="<s:property value="hlminfo.sfzb"/>" />
			</td>
			<td class="dark">技术职称</td>
			<td><s:property value="hlminfo.jszc" />
			</td>
		</tr>
		<tr>
			<td class="dark">技术等级</td>
			<td><s:property value="hlminfo.jsdj" />
			</td>
			<td class="dark">人员结构</td>
			<td><s:property value="hlminfo.ryjg" />
			</td>
			<td class="dark">社会身份</td>
			<td><s:property value="hlminfo.shsf" />
			</td>
		</tr>
		<tr>
			<td class="dark">专长爱好</td>
			<td><s:property value="hlminfo.zcah" />
			</td>
			<td class="dark">户口类别</td>
			<td><select name="hlminfo.hklb" id="sel_hklb">
					<option value="">-----请选择-----</option>
			</select> <input type="hidden" id="input_hklb"
				value="<s:property value="hlminfo.hklb"/>" />
			</td>
			<td class="dark">户口所在地</td>
			<td><s:property value="hlminfo.hkszd" />
			</td>
		</tr>
		<tr>
			<td class="dark">困难类别</td>
			<td><s:property value="hlminfo.knlb" />
			</td>
			<td class="dark">通邮住址</td>
			<td><s:property value="hlminfo.tydz" />
			</td>
			<td class="dark">邮政编码</td>
			<td><s:property value="hlminfo.zzbm" />
			</td>
		</tr>
		<tr>
			<td class="dark">家庭人口数</td>
			<td><s:property value="hlminfo.jtrk" />
			</td>
			<td class="dark">住房面积</td>
			<td><s:property value="hlminfo.zfmj" />
			</td>
			<td class="dark">联系电话</td>
			<td><s:property value="hlminfo.lxdh" />
			</td>
		</tr>
		<tr>
			<td class="dark">其他电话</td>
			<td><s:property value="hlminfo.qtdh" />
			</td>
			<td class="dark">健康状况</td>
			<td><s:property value="hlminfo.jkzt" />
			</td>
			<td class="dark">残疾类别</td>
			<td><s:property value="hlminfo.cjlb" />
			</td>
		</tr>
		<tr>
			<td class="dark">疾病说明</td>
			<td colspan="5"><textarea rows="3" cols="80" disabled="disabled"><s:property value="hlminfo.jbsm" /></textarea>
			</td>
		</tr>
		<tr>
			<td class="dark">参保情况</td>
			<td><s:property value="hlminfo.cbqk" />
			</td>
			<td class="dark">荣誉津贴</td>
			<td><s:property value="hlminfo.ryjt" />
			</td>
			<td class="dark">个人月收入</td>
			<td><s:property value="hlminfo.ysr" />
			</td>
		</tr>
		<tr>
			<td class="dark">配偶姓名</td>
			<td><s:property value="hlminfo.poname" />
			</td>
			<td class="dark">配偶生日</td>
			<td><s:date name="hlminfo.pocstime" format="yyyy-MM-dd" />
			</td>
			<td class="dark">配偶月收入</td>
			<td><s:property value="hlminfo.poysr" />
			</td>
		</tr>
		<tr>
			<td class="dark">配偶健康状况</td>
			<td><s:property value="hlminfo.pojkzk" />
			</td>
			<td class="dark">配偶疾病</td>
			<td><s:property value="hlminfo.pojb" />
			</td>
			<td class="dark">配偶就业状况</td>
			<td><s:property value="hlminfo.pojyzk" />
			</td>
		</tr>
	</table>
</body>
</html>
