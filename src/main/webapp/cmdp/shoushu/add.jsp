<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="assets/css/baidu.css">
<div class="clearfix"></div>
<div class="col-md-6">
    <form class="form-horizontal" id="subForm" method="post" action="cmdphd/saveKSXXInfo">
        <input type="hidden" id="ksidID" name="ksid" value="${obj.ksid}"/>
        <div class="form-group">
            <label class="col-md-2 control-label">科室名称*</label>
            <div class="col-md-8">
                <input class="form-control" name="mingcheng" value="${obj.mingcheng}" required errInfo="科室名称不能为空" type="text" placeholder="科室名称" <c:if test="${obj.ksid!=null}">disabled="disabled"</c:if> />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-2 control-label">科室编码*</label>
            <div class="col-md-8">
                <input name="keshiBM" value="${obj.keshiBM}" type="text" required errInfo="科室编码不能为空" class="form-control" placeholder="科室编码" <c:if test="${obj.ksid!=null}">disabled="disabled"</c:if> />
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">隶属国家标准*</label>
            <div class="col-md-8">
                <input id="biaozhunLiShuID" class="form-control" type="text" value="${obj.biaozhunLiShuName}" placeholder="隶属国家标准" fangbaidu_searurl="/cmdphd/searchLSKSGJBZINFO" />
                <input id="biaozhunLiShuID_BM" name="biaozhunLiShu" value="${obj.biaozhunLiShu}" type="hidden" required errInfo="隶属国家标准不能为空"/>
                <div id="disRSDIVID" class="bdsug" style="height: auto; display: none;">
                    <ul id="addULID">
                    </ul>
                </div>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label">科室类型*</label>
            <div class="col-md-8">
                <input id="hiddenval_ksType" type="hidden" value="${obj.ksType}"/>
                <select name="ksType" class="form-control" id="ksTypeSelect" required errInfo="科室类型不能为空" <c:if test="${obj.ksid!=null}">disabled="disabled"</c:if> >
                    <option value="">请选择科室</option>
                    <option value="1">门诊科室</option>
                    <option value="2">住院科室</option>
                    <option value="3">医技科室</option>
                    <option value="4">管理科室</option>
                    <option value="5">后勤科室</option>
                    <option value="9">其他科室</option>
                </select>
            </div>
        </div>
    </form>
    <div class="form-group col-md-offset-4" style="margin-top: 30px">
        <button class="btn btn-primary" id="subBT" type="button">保存</button>
        <button id="backBTID" href="/cmdphd/getAllHospitalOffice" class="btn btn-default" type="button">返回</button>
    </div>
</div>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/baidu.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/keshi/add.js"></script>

