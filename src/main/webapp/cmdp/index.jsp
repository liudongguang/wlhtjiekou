<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <base href="${pageContext.request.contextPath }/"/>
    <meta charset="utf-8">
    <!--[if IE]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
    <title>信息管理</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/bootstrap3.3.7.css">
    <link rel="stylesheet" href="assets/css/templatemo_main.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/bootstrap-datetimepicker.css">
</head>
<body>
<input type="hidden" id="basePath" value="${pageContext.request.contextPath }/"/>
<div class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
        <div class="logo">
            <img src="assets/images/cmdp/xamlogo.jpg">
        </div>
    </div>
    <div class="pull-right">
        <div class="person_a">
            <label>你好，${sessionScope.user.name}</label>

            <div class="btn-group">
                <a type="button" data-toggle="dropdown" aria-haspopup="true"
                   aria-expanded="false" style="background:none"> <span class="caret"></span></a>
                <ul class="dropdown-menu" style=" min-width:100px;">
                    <!--
                    <li><a ajaxhref href="/followupDisplay/updatePass.jsp">修改密码</a></li>
                    -->
                    <li><a href="cmdphd/loginOut">退出</a></li>
                </ul>
            </div>
        </div>
    </div>
    <!--btn-group结束-->

</div>
<div class="template-page-wrapper">
    <div class="navbar-collapse collapse templatemo-sidebar">
        <ul class="templatemo-sidebar-menu">
            <!-- <li>
               <form class="navbar-form">
                 <input type="text" class="form-control" id="templatemo_search_box" placeholder="Search...">
                 <span class="btn btn-default">go</span>
               </form>
             </li>-->
            <li class="active"><a href="javascript:;"><i class="fa fa-home"></i>首页</a></li>
            <li class="sub open"><a href="javascript:;"><span class="glyphicon glyphicon-calendar btn-lg"></span> 信息管理
                <div class="pull-right tt"><span class="caret caret-nav"></span></div>
            </a>
                <ul class="templatemo-submenu">
                    <li><a id="cysfID" href="/cmdphd/getAllHospitalOffice"><span class="glyphicon glyphicon-list-alt"></span>科室设置</a>
                    </li>
                    <li><a id="dxtjID" href="/cmdphd/getAllHospitalMan"><span class="glyphicon glyphicon-list-alt"></span>医师设置</a>
                    </li>
                    <li><a id="sjdrID" href="/cmdp/mainimport/index.jsp"><span class="glyphicon glyphicon-list-alt"></span>数据导入</a>
                    </li>
                    <li><a  href="/cmdp/importexcel/index.jsp"><span class="glyphicon glyphicon-list-alt"></span>EXCEL导入</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
    <!--/.navbar-collapse -->

    <div class="templatemo-content-wrapper">
        <div class="templatemo-content-page">
            <div class="templatemo-content-title">
                <ol id="titleBarID" class="breadcrumb" style="margin-bottom: 0">
                    <li><a href="javascript:;">首页</a></li>
                    <li><a href="javascript:;" id="v1ID"></a></li>
                    <li class="active" id="v2ID"></li>
                </ol>
            </div>
        </div>
        <div id="mainContent" class="templatemo-content" style="min-height:775px;">

        </div>
    </div>
</div>
<footer class="templatemo-footer">
    <div class="templatemo-copyright">
        <p></p>
    </div>
</footer>
<script language="javascript" type="text/javascript" src="assets/js/jquery-3.2.0.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/bootstrap3.3.7.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/templatemo_script.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/moment.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/bootstrap-datetimepicker.min.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/layer/layer.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/common.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/main/ajaxsessiontimeout.js"></script>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/index.js"></script>
</body>
</html>