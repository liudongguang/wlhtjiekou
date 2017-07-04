jQuery(document).ready(function () {
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    }, true, function (form, options) {
        //修改情况直接进行提交
        if($("#ysID").val()){
            options.zzcid = layer.load(0, {
                shade: [0.8, '#fff']
                // 0.1透明度的白色背景
            });
            form.ajaxSubmit(options);
            return false;
        }
        var jq_idcard=$("input[name=idcard]");
        var idcardVal=jq_idcard.val();
        if(!idcardVal){
            alertNullMsg(jq_idcard);
            return false;
        }
        var ajaxOpt = {
            paramurl: $("#basePath").val() + "/cmdphd/checkIDCardForHospitalMan",
            paramdata: {"idcard":jq_idcard.val()},
            dataType: 'json',
            callbackFun: function (data) {
                if (data.errcode == 0) {
                    options.zzcid = layer.load(0, {
                        shade: [0.8, '#fff']
                        // 0.1透明度的白色背景
                    });
                    form.ajaxSubmit(options);
                } else {
                    layer.alert(data.errmsg);
                }
            }
        };
        ajaxRun(ajaxOpt);
    });

    initBackBt($("#backBTID"), $("#mainContent"));

    $('#cjgzTimeID').datetimepicker({
        format: 'YYYY-MM-DD',
        showTodayButton:true
    });
});