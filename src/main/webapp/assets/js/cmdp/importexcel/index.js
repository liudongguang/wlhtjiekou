jQuery(document).ready(function () {
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    }, true);
    initAjaxForm($("#subForm2"), $("#subBT2"), function (data) {
        $("#mainContent").empty().html(data);
    }, true);
});