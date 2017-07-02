<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="col-md-6">
    ${ksmessage}
    <form class="form-horizontal" id="subForm" method="post" action="wlhtData/ksExcelImport"
          enctype="multipart/form-data">
        <div class="form-group">
            <label class="col-md-2 control-label">科室导入</label>
            <div class="col-md-8">
                <input class="form-control" name="keshiExcel" type="file" required errInfo="科室文件未选择！"/>
                <button class="btn btn-primary btn-large pull-right" id="subBT" style="margin-top: 10px">
                    导入科室
                </button>
            </div>
        </div>
    </form>
    ${yishimessage}
    <form class="form-horizontal" id="subForm2" method="post" action="wlhtData/yishiExcelImport">
        <div class="form-group">
            <label class="col-md-2 control-label">医师导入</label>
            <div class="col-md-8">
                <input class="form-control" name="yishiExcel" type="file" required errInfo="医师文件未选择！"/>
                <button class="btn btn-primary btn-large pull-right" id="subBT2" style="margin-top: 10px">
                    导入医师
                </button>
            </div>
        </div>

    </form>
</div>
<script language="javascript" type="text/javascript" src="assets/js/cmdp/importexcel/index.js"></script>