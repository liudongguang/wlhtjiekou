jQuery(document).ready(function () {
    var jq_input_IDVal = $("#baidu_inputid");//输入框id
    var jq_searchURL = $("#baidu_searurl");//查询数据
    var jq_disDIV = $("#disRSDIVID");
    var jq_addDataUL = $("#addULID");
    $("#" + jq_input_IDVal.val()).keyup(
        function () {
            var getVal = $(this).val();
            if (getVal) {
                var ajaxOpt = {
                    paramurl: $("#basePath").val() + jq_searchURL.val(),
                    paramdata: {"inputVal": getVal},
                    dataType: 'json',
                    callbackFun: function (data) {
                        jq_disDIV.show();
                        if (data.errcode == 0) {

                        } else {
                            layer.alert(data.errmsg);
                        }
                    }
                };
                ajaxRun(ajaxOpt);
            } else {
                jq_input_IDVal.val("")
                jq_disDIV.hide();
            }
        });

})