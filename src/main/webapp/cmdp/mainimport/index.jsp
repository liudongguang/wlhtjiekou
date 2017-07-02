<%@ page language="java" pageEncoding="utf-8"%>
<span style="color: red">
   ${errmsg}
</span>
     <p>选择日期范围进行导入病案数据，已导入的数据部会再次导入！日期范围最大不要超过6个月！</p>
<form id="subForm" action="wlhtData/wlthDR" class="form-inline" method="post">
	<div class="form-group" style="position: relative;">
		<span> 导入时间段：</span>
		<input id="starteID" name="starte" value="${param.starte}" type="text" class="form-control" placeholder="开始时间">-
		<input id="endID" name="end" value="${param.end}" type="text" class="form-control" placeholder="结束时间">
	</div>
	<div class="form-group" style="margin-left:15px;">
		<button class="btn btn-primary btn-large" id="subBT">
			导入数据
		</button>
	</div>
</form>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/mainimport/index.js"></script>

