jQuery(document).ready(function () {
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    }, true, function (form, options) {
        var jq_mc=$("input[name=mingcheng]");
        var jq_ksbm=$("input[name=KeshiBM]");
        if(!jq_mc.val()){
            alertNullMsg(jq_mc);
            return false;
        }
        if(!jq_ksbm.val()){
            alertNullMsg(jq_ksbm);
            return false;
        }
        var ajaxOpt = {
            paramurl: $("#basePath").val() + "/cmdphd/checkOfficeNameAndCode",
            paramdata: {"mingcheng": jq_mc.val(), "KeshiBM": jq_ksbm.val()},
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

    initBackBt($("#backBTID"),  $("#mainContent"));
});