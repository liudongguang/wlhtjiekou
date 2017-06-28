$(document).ready(function() {
	var basePath = $("#basePH").val();
	var zidianState=$("#zidianState").val();
	//////////////检索
	// /出院科室
	$.post(basePath + 'cmdphd/getZidianInfo', {
		zidianState : zidianState
	}, function(data) {
		var ksTypeData=data['kstype'];
		if(ksTypeData){
			var comSelect=$("#ksType_id");
			xunhuan(comSelect, ksTypeData);
			var input_ksType_idVal=$("#input_ksType_id").val();
			if(input_ksType_idVal){
			comSelect.val(input_ksType_idVal);
			}
		}
	}, 'json');
});