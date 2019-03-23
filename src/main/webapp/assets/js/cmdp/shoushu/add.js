jQuery(document).ready(function () {
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    }, false);
    initBackBt($("#backBTID"),  $("#mainContent"));
});