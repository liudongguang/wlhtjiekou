<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="assets/css/baidu.css">
<div class="clearfix"></div>
<div class="col-md-6">
    <form class="form-horizontal" id="subForm" method="post" action="shoushu/saveShoushu">
        <input type="hidden" name="id" value="${obj.id}"/>
        <div class="form-group">
            <label class="col-md-4 control-label">手术名称*</label>
            <div class="col-md-8">
                <input class="form-control"  value="${obj.name}"  type="text" placeholder="手术名称" disabled="disabled" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label">手术编码*</label>
            <div class="col-md-8">
                <input  value="${obj.code}" type="text"  class="form-control" placeholder="手术编码" disabled="disabled" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">手术等级</label>
            <div class="col-md-8">
                <select name="level" class="form-control" >
                    <option value="">请选择手术等级</option>
                    <c:forEach items="${ssLevellist}" var="levelobj">
                        <option <c:if test="${obj.level==levelobj.code}">selected</c:if> value="${levelobj.code}"  >${levelobj.code}-${levelobj.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label">手术操作标识</label>
            <div class="col-md-8">
                <select name="stdopsoperationmark" class="form-control">
                    <option value="">请选择手术操作标识</option>
                    <c:forEach items="${ssmarklist}" var="markobj">
                        <option  <c:if test="${markobj.code==obj.stdopsoperationmark}">selected</c:if> value="${markobj.code}">${markobj.code}-${markobj.name}</option>
                    </c:forEach>
                </select>

            </div>
        </div>
    </form>
    <div class="form-group col-md-offset-4" style="margin-top: 30px">
        <button class="btn btn-primary" id="subBT" type="button">保存</button>
        <button id="backBTID" href="/shoushu/getAllShoushu" class="btn btn-default" type="button">返回</button>
    </div>
</div>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxForm.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/baidu.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/shoushu/add.js"></script>

