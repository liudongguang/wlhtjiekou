<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="clearfix"></div>
<div class="row margin-bottom-30">
    <div class="col-md-12">
        <form id="subForm" action="cmdphd/getAllHospitalOffice" class="form-inline" method="post">
            <div class="form-group">
                <span> 科室名称：</span> <input name="ksName" class="form-control" type="text" value="${param.ksName}">
            </div>
            <div class="form-group" style="margin-left:15px;">
                <span>科室类型：</span>
                <input id="hiddenval_ksType" type="hidden" value="${param.ksType}"/>
                <select name="ksType" class="form-control" id="ksTypeSelect">
                    <option value="">请选择科室</option>
                    <option value="1">门诊科室</option>
                    <option value="2">住院科室</option>
                    <option value="3">医技科室</option>
                    <option value="4">管理科室</option>
                    <option value="5">后勤科室</option>
                    <option value="9">其他科室</option>
                </select>
            </div>
            <div class="form-group" style="margin-left:15px;">
                <button class="btn btn-primary btn-large" id="subBT">
                    查询
                </button>
                <button class="btn btn-success btn-large" ajaxthispage href="/cmdp/keshi/add.jsp">
                    新增
                </button>
            </div>
        </form>

    </div>
</div>
<div class="table-responsive">
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <td align="center">科室名称</td>
            <td align="center">科室编码</td>
            <td align="center">隶属标准编码</td>
            <td align="center">隶属标准名称</td>
            <td align="center">科室类型</td>
            <td align="center">拼音索引</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${page.list}" var="obj">
            <tr>
                <td>${obj.mingcheng}</td>
                <td>${obj.keshiBM}</td>
                <td>${obj.biaozhunLiShu}</td>
                <td>${obj.biaozhunLiShuName}</td>
                <td>${obj.ksType}</td>
                <td>${obj.shouzimuIndex}</td>
                <td><a class="label label-success" ajaxthispage searFormID="subForm" pageNum="${page.pageNum}"
                         href="/cmdphd/editHoapitalOffice?ksid=${obj.ksid}">修改</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<!--
分页开始
-->
<div id="pagesDIV" style="margin: 0 auto"></div>
<input id="pageNum" type="hidden" value="${page.pageNum}"/>
<input id="pageSize" type="hidden" value="${page.pageSize}"/>
<input id="total" type="hidden" value="${page.total}"/>
<input id="pages" type="hidden" value="${page.pages}"/>
<input id="loadDataURL" type="hidden" value="/cmdphd/getAllHospitalOffice"/>
<input id="searFormID" type="hidden" value="subForm"/>
<!--
分页结束
-->
<script language="javascript" type="text/javascript" src="assets/js/jPage-1.2.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/jPageExt.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/keshi/list.js"></script>

