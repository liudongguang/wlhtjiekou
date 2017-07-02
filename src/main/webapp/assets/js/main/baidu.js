jQuery(document).ready(function () {
    var jq_disDIV = $("#disRSDIVID");
    var jq_addDataUL = $("#addULID");
    $("[fangbaidu_searurl]").each(function () {
        var jq_Input = $(this);//输入框
        var jq_Input_ID = jq_Input.attr("id");//输入框id
        var searchURL=jq_Input.attr("fangbaidu_searurl");//查询url
        var jq_InputHide = $("#" + jq_Input_ID + "_BM");//隐藏框，保存着选择的编码，将要存入DB的
        jq_Input.keyup(
            function () {
                var getVal = $(this).val();
                if (getVal && getVal.length >= 2) {
                    var ajaxOpt = {
                        paramurl: $("#basePath").val() + searchURL,
                        paramdata: {"searVal": getVal},
                        dataType: 'json',
                        callbackFun: function (data) {
                            var mdata = data.data;
                            jq_addDataUL.empty();
                            for (var index in mdata) {
                                createLI(mdata[index],jq_Input,jq_InputHide);
                            }
                            jq_disDIV.show();
                        }
                    };
                    ajaxRun(ajaxOpt);
                } else {
                    jq_InputHide.val("");
                    jq_disDIV.hide();
                }
            });
    });

    function createLI(data,jq_Input,jq_InputHide) {
        var jq_li = $("<li data-key='" + data.code + "' class='bdsug-overflow'" + ">[" + data.code + "]" + data.name + "</li>");
        jq_li.click(function () {
            var jq_this = $(this);
            var key = jq_this.attr("data-key");
            var val = jq_this.text();
            jq_Input.val(val.split("]")[1]);
            jq_InputHide.val(key);
            jq_disDIV.hide();
        })
        jq_addDataUL.append(jq_li);
    }

})