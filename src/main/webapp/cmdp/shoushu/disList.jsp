<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="clearfix"></div>
<div class="row margin-bottom-30">
    <div class="col-md-12">
        <form id="subForm" action="shoushu/getAllShoushu" class="form-inline" method="post">
            <div class="form-group">
                <span> 手术名称：</span> <input name="ssname" class="form-control" type="text" value="${param.ssname}">
            </div>
            <div class="form-group" style="margin-left:15px;">
                <span> 手术编码：</span> <input name="sscode" class="form-control" type="text" value="${param.sscode}">
            </div>
            <div class="form-group" style="margin-left:15px;">
                <button class="btn btn-primary btn-large" id="subBT">
                    查询
                </button>
                <!--
                <button class="btn btn-success btn-large" ajaxthispage href="/cmdp/keshi/add.jsp">
                    新增
                </button>
                -->
            </div>
        </form>

    </div>
</div>
<div class="table-responsive">
    <table class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <td align="center">手术名称</td>
            <td align="center">手术编码</td>
            <td align="center">手术等级</td>
            <td align="center">手术操作标识</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${page.list}" var="obj">
            <tr>
                <td>${obj.name}</td>
                <td>${obj.code}</td>
                <td>${obj.level}
                    <c:if test="${obj.level!=null}">
                    （${obj.levelName}）</c:if></td>
                <td>${obj.stdopsoperationmark}
                    <c:if test="${obj.stdopsoperationmark!=null}">
                    （${obj.stdopsoperationmarkName}）
                    </c:if></td>
                <td><a class="label label-success" ajaxthispage searFormID="subForm" pageNum="${page.pageNum}"
                         href="/shoushu/editHoapitalShoushu?id=${obj.id}">修改</a></td>
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
<input id="loadDataURL" type="hidden" value="/shoushu/getAllShoushu"/>
<input id="searFormID" type="hidden" value="subForm"/>
<!--
分页结束
-->
<script language="javascript" type="text/javascript" src="assets/js/jPage-1.2.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/jPageExt.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/shoushu/list.js"></script>

