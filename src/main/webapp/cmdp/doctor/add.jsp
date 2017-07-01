<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="assets/css/baidu.css">
<div class="clearfix"></div>
<div class="col-md-6">
    <form class="form-horizontal" id="subForm" method="post" action="cmdphd/saveYSXXInfo">
        <div class="form-group">
            <label class="col-md-2 control-label">医师名称*</label>
            <div class="col-md-8">
                <input class="form-control" name="ysname" required errInfo="医师名称不能为空" type="text" placeholder="医师名称">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">医师身份证*</label>
            <div class="col-md-8">
                <input name="idcard" type="text" required errInfo="医师身份证不能为空" class="form-control" placeholder="医师身份证">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">参加工作时间</label>
            <div class="col-md-8">
                <input id="cjgzTimeID" name="workday" type="text" class="form-control" placeholder="参加工作时间">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">所在科室*</label>
            <div class="col-md-8">
                <input id="ksinputID" name="KeshiBM" type="text" required errInfo="所在科室不能为空" class="form-control" placeholder="所在科室">
                <div id="disRSDIVID" class="bdsug" style="height: auto; display: none;">
                    <ul id="addULID">
                        <li data-key="萨德" class="bdsug-overflow">萨德<i class="c-icon c-icon-bear-round"></i></li>
                        <li data-key="萨德事件" class="bdsug-overflow">萨德事件</li>
                        <li data-key="萨德最新消息" class="bdsug-overflow">萨德最新消息</li>
                        <li data-key="萨顶顶" class="bdsug-overflow">萨顶顶</li>
                    </ul>
                </div>
            </div>
        </div>
    </form>
    <div class="form-group col-md-offset-4" style="margin-top: 30px">
        <button class="btn btn-primary" id="subBT" type="button">保存</button>
        <button id="backBTID" href="/cmdphd/getAllHospitalMan" class="btn btn-default" type="button">返回</button>
    </div>
    <input type="hidden" id="baidu_inputid" value="ksinputID"/>
    <input type="hidden" id="baidu_searurl" value="/cmdphd/searchKSINFO"/>
</div>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/baidu.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/doctor/add.js"></script>

