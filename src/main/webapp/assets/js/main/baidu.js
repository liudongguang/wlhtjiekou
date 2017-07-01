jQuery(document).ready(function () {
    var jq_input_IDVal = $("#baidu_inputbianmaid").val();//输入框id
    var jq_input_hanziVal= $("#baidu_inputhanzid").val();//汉字显示保存的id
    var jq_searchURL = $("#baidu_searurl");//查询数据
    var jq_disDIV = $("#disRSDIVID");
    var jq_addDataUL = $("#addULID");
    var jq_Input=$("#"+jq_input_hanziVal);//显示汉字
    var jq_InputHide=$("#"+jq_input_IDVal);//保存编码的
    jq_Input.keyup(
        function () {
            var getVal = $(this).val();
            if (getVal&&getVal.length>=2) {
                var ajaxOpt = {
                    paramurl: $("#basePath").val() + jq_searchURL.val(),
                    paramdata: {"searVal": getVal},
                    dataType: 'json',
                    callbackFun: function (data) {
                        var mdata=data.data;
                        jq_addDataUL.empty();
                        for(var index in mdata){
                            createLI(mdata[index]);
                        }
                        jq_disDIV.show();
                    }
                };
                ajaxRun(ajaxOpt);
            } else {
                jq_disDIV.hide();
            }
        });
    function createLI(data) {
        var jq_li=$("<li data-key='"+data.code+"' class='bdsug-overflow'"+">["+data.code+"]"+data.name+"</li>");
        jq_li.click(function () {
            var jq_this=$(this);
            var key=jq_this.attr("data-key");
            var val=jq_this.text();
            jq_Input.val(val.split("]")[1]);
            jq_InputHide.val(key);
            jq_disDIV.hide();
        })
        jq_addDataUL.append(jq_li);
    }

})