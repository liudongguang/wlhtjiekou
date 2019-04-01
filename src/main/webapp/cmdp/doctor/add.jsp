<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="assets/css/baidu.css">
<div class="clearfix"></div>
<div class="col-md-6">
    <form class="form-horizontal" id="subForm" method="post" action="cmdphd/saveYSXXInfo">
        <input type="hidden" id="ysID" name="id" value="${obj.id}"/>
        <input type="hidden" id="yyidentityID" name="yyidentity" value="${obj.yyidentity}"/>
        <div class="form-group">
            <label class="col-md-4 control-label">医师名称*</label>
            <div class="col-md-8">
                <input class="form-control" name="ysname" value="${obj.ysname}" required errInfo="医师名称不能为空" type="text" placeholder="医师名称">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">医师身份证*</label>
            <div class="col-md-8">
                <input name="idcard" value="${obj.idcard}" type="text" required errInfo="医师身份证不能为空" class="form-control" placeholder="医师身份证">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">工号*</label>
            <div class="col-md-8">
                <input name="gonghao" value="${obj.gonghao}" type="text" required errInfo="工号不能为空" class="form-control" placeholder="工号">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">参加工作时间</label>
            <div class="col-md-8">
                <input id="cjgzTimeID" name="workday" value="<fmt:formatDate value="${obj.workday}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>" type="text" class="form-control" placeholder="参加工作时间">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">所在科室*</label>
            <div class="col-md-8">
                <input id="suozaiksID"  type="text" value="${obj.suozaiks}"   class="form-control" placeholder="所在科室"    fangbaidu_searurl="/cmdphd/searchKSINFO"/>
                <input id="suozaiksID_BM" name="suozaiks" value="${obj.suozaiksBm}" type="hidden" required errInfo="所在科室不能为空" />
                <div id="disRSDIVID" class="bdsug" style="height: auto; display: none;">
                    <ul id="addULID">
                    </ul>
                </div>
            </div>
        </div>
    </form>
    <div class="form-group col-md-offset-4" style="margin-top: 30px">
        <button class="btn btn-primary" id="subBT" type="button">保存</button>
        <button id="backBTID" href="/cmdphd/getAllHospitalMan" class="btn btn-default" type="button">返回</button>
    </div>
</div>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/baidu.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/doctor/add.js"></script>

