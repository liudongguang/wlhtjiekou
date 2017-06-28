function xunhuan(comSelect, xhData) {
	for ( var index in xhData) {
		var name = xhData[index].name;
		var code = xhData[index].code;
		var opt = $("<option></option>").val(code).text(name);
		comSelect.append(opt);
	}
}
function xunhuanaddJG(comSelect, xhData) {
	for ( var index in xhData) {
		var code = xhData[index].dwcode;
		var name = xhData[index].dwname;
		var opt = $("<option></option>").val(code).text(name);
		comSelect.append(opt);
	}
}
function xunhuanZiDian2(data, com, codeInput, NameInput) {
	for ( var index in data) {
		var Obj = data[index];
		var code = Obj.code;
		var name = Obj.name;
		var opt = $("<div>").attr('code', code).text(code + "-" + name)
				.addClass("suggest_link");
		opt.mouseover(function() {
			$(this).addClass("suggest_link_over");
		}).mouseout(function() {
			$(this).removeClass("suggest_link_over");
			$(this).addClass("suggest_link");
		}).click(function() {
			// 获取值
			var selectDivObj = $(this);
			var code = selectDivObj.attr("code");
			var text = selectDivObj.text().split("-")[1];
			// 赋值
			codeInput.val(code);
			NameInput.val(text);
			codeInput.change();
			// 隐藏显示层
			com.hide();
		});
		com.append(opt);
	}
}
function defaultSelect(jq_select, SeldataStr) {
	var inputVal = $("input[id=input_" + SeldataStr + "]").val();
	if (inputVal) {
		jq_select.val(inputVal);
		var hanyuVal = jq_select.find("option:selected").text();
		var parentTd = jq_select.parent();
		jq_select.remove();
		parentTd.append(hanyuVal);
	} else {
		var disVal = $("#disInput").val();
		if ("disry" == disVal) {
			jq_select.remove();
		}
	}
}
function checkFormInput(panduanNumIsNull) {
	var doubleInputs = $("input[type='text'][double]");
	var numInputs = $("input[type='text'][num]");
	var notNulls = $("[notnull]");
	var trState = true;
	notNulls.each(function() {
		var jq_this = $(this);
		if (!jq_this.val()) {
			// 没值的时候
			var tishiText = jq_this.parent().prev().text();
			alert(tishiText.substring(1, tishiText.length) + "  不能为空!");
			trState = false;
			return false;
		}
	});
	if (!trState) {
		return trState;
	}
	doubleInputs.each(function() {
		var thisStrInput = $(this);
		var errStrVal = thisStrInput.attr("errStr");
		var inputVal = $.trim(thisStrInput.val());
		if (inputVal) {
			// 必须为double
			var reg1 = new RegExp("^[0-9]*\.?[0-9]*$");
			if (!reg1.test(inputVal)) {
				if (errStrVal) {
					alert(errStrVal + " 请输入数字！");
				} else {
					var tishiText = thisStrInput.parent().prev().text();
					alert(tishiText + "  请输入数字!");
				}
				trState = false;
				return false;
			}
		} else {
			if (panduanNumIsNull) {
				// 没有值的时候
				if (errStrVal) {
					alert(errStrVal + " 不能为空！");
				} else {
					var tishiText = thisStrInput.parent().prev().text();
					alert(tishiText.substring(1, tishiText.length) + " 不能为空！");
				}
				trState = false;
				return false;
			}
		}
	});
	if (!trState) {
		return trState;
	}
	numInputs.each(function() {
		var thisNumInput = $(this);
		var inputVal = $.trim(thisNumInput.val());
		if (inputVal) {
			// 必须为数字
			var reg = new RegExp("^[0-9]*$");
			if (!reg.test(inputVal)) {
				var tishiText = thisNumInput.parent().prev().text();
				alert(tishiText + "  请输入整数!");
				trState = false;
				return false;
			}
		} else {
			// 没有值的时候
			if (panduanNumIsNull) {
				var tishiText = thisNumInput.parent().prev().text();
				alert(tishiText.substring(1, tishiText.length) + " 不能为空！");
				trState = false;
				return false;
			}
		}
	});
	return trState;
}
function checkSFZ(basePath) {
	$("#shenfz_id").blur(function() {
		var jq_this = $(this);
		var thisVal = jq_this.val();
		if (thisVal) {
			$.post(basePath + "weist/validateShenFenZheng.action", {
				checkVal : thisVal
			}, function(data) {
				var rtMsg = data['message'];
				if (rtMsg) {
					alert(rtMsg);
					jq_this.val("").focus();
				}
			}, 'json');
		}
	});
}

