jQuery(document).ready(function () {
    var jq_content=$("#mainContent");
    initTable(jq_content);
    ///////////////////////
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    });
    //////
    //////
    initSetData();
    /////
});