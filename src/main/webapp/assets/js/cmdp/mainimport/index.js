jQuery(document).ready(function () {
    $('#starteID').datetimepicker({
        format: 'YYYY-MM-DD',
        showTodayButton: true
    });
    $('#endID').datetimepicker({
        format: 'YYYY-MM-DD',
        showTodayButton: true
    });
    initAjaxForm($("#subForm"), $("#subBT"), function (data) {
        $("#mainContent").empty().html(data);
    }, true);
});