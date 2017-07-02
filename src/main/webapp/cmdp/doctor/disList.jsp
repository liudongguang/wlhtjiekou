<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="clearfix"></div>
<div class="row margin-bottom-30">
    <div class="col-md-12">
        <form id="subForm" action="cmdphd/getAllHospitalMan" class="form-inline" method="post">
            <div class="form-group">
                <span> 医师姓名：</span> <input name="ysName" class="form-control" type="text" value="${param.ysName}">
            </div>
            <div class="form-group">
                <span> 身份证号：</span> <input name="cardId" class="form-control" type="text" value="${param.cardId}">
            </div>
            <div class="form-group">
                <span> 所在科室：</span> <input name="suozaiksbm" class="form-control" type="text" value="${param.suozaiksbm}">
            </div>
            <div class="form-group" style="margin-left:15px;">
                <button class="btn btn-primary btn-large" id="subBT">
                    查询
                </button>
                <button class="btn btn-success btn-large" ajaxthispage href="/cmdp/doctor/add.jsp">
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
            <td>医师姓名</td>
            <td>所在科室</td>
            <td>身份证号</td>
            <td>出生日期</td>
            <td>参加工作时间</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${page.list}" var="obj">
            <tr>
                <td>${obj.ysname}</td>
                <td>${obj.suozaiks}</td>
                <td>${obj.idcard}</td>
                <td><fmt:formatDate value="${obj.birthday}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                <td><fmt:formatDate value="${obj.workday}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                <td>
                    <a class="label label-success" ajaxthispage searFormID="subForm" pageNum="${page.pageNum}"
                       href="/cmdphd/editHoapitalMan?id=${obj.id}">修改</a>
                    <a class="label label-warning" ajaxdel searFormID="subForm" pageNum="${page.pageNum}"
                       href="/cmdphd/delHoapitalMan?id=${obj.id}">删除</a>
                </td>
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
<input id="loadDataURL" type="hidden" value="/cmdphd/getAllHospitalMan"/>
<input id="searFormID" type="hidden" value="subForm"/>
<!--
分页结束
-->
<script language="javascript" type="text/javascript" src="assets/js/jPage-1.2.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/jPageExt.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/doctor/list.js"></script>

