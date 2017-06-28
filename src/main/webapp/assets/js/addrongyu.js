$(document).ready(
		function() {
			var basePath = $("#basePH").val();
			var getZidianStrVal = $("#getZidianStr").val();
			$("#forBackBt").click(function() {
				// window.location.href = basePath + "weist/getAllRongyuXInxi";
				window.history.back(-1);
			});
			$.post(basePath + 'weist/testZidian', {
				getZidianStr : getZidianStrVal
			}, function(data) {
				var jq_select = $("select");
				jq_select.each(function() {
					var thisSel = $(this);
					var id = thisSel.attr("id");
					var ids = id.split("_");
					var SeldataStr = ids[1];
					var Seldata = data[SeldataStr];
					xunhuan(thisSel, Seldata);
					var inputVal = $("input[id=input_" + SeldataStr + "]")
							.val();
					if (inputVal) {
						thisSel.val(inputVal);
						var hanyuVal = thisSel.find("option:selected").text();
						var parentTd = thisSel.parent();
						thisSel.remove();
						parentTd.append(hanyuVal);
					} else {
						var disVal = $("#disInput").val();
						if ("disry" == disVal) {
							thisSel.remove();
						}
					}
				});
			}, 'json');
			$("#subRLForm").submit(
					function() {
						var doubleInputs = $("input[type='text'][double]");
						var numInputs = $("input[type='text'][num]");
						var notNulls = $("[notnull]");
						var trState = true;
						notNulls.each(function() {
							var jq_this = $(this);
							if (!jq_this.val()) {
								// 没值的时候
								var tishiText = jq_this.parent().prev().text();
								alert(tishiText.substring(1, tishiText.length)
										+ "  不能为空!");
								trState = false;
								return false;
							}
						});
						doubleInputs.each(function() {
							var thisStrInput = $(this);
							var inputVal = $.trim(thisStrInput.val());
							if (!inputVal) {
								// 没有值的时候
								// var tishiText =
								// thisStrInput.parent().prev().text();
								// alert(tishiText.substring(0, tishiText.length
								// - 1) + "
								// 不能为空！");
								// trState = false;
								// return false;
							} else {
								// 必须为double
								var reg1 = new RegExp("^[0-9]*\.?[0-9]*$");
								if (!reg1.test(inputVal)) {
									var tishiText = thisStrInput.parent()
											.prev().text();
									alert(tishiText + "  请输入数字!");
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
							if (!inputVal) {
								// 没有值的时候
								// var tishiText =
								// thisNumInput.parent().prev().text();
								// alert(tishiText.substring(0, tishiText.length
								// - 1) + "
								// 不能为空！");
								// trState = false;
								// return false;
							} else {
								// 必须为数字
								var reg = new RegExp("^[0-9]*$");
								if (!reg.test(inputVal)) {
									var tishiText = thisNumInput.parent()
											.prev().text();
									alert(tishiText + "  请输入数字!");
									trState = false;
									return false;
								}
							}
						});
						return trState;
					});
			$("input[id^='radio_']").each(
					function() {
						var thisradio = $(this);
						var idAll = thisradio.attr("id");
						var nameradio = idAll.split("_")[1];
						var radioVal = thisradio.val();
						if (radioVal) {
							$(
									"input[name$=" + nameradio + "][value="
											+ radioVal + "]").attr("checked",
									"checked");
						}
					});
			// //////////////籍贯
			var jq_search_suggest_jiguan = $("#search_suggest_jiguan");
			$("#jiansuo_jiguan").keyup(
					function() {
						var getVal = $(this).val();
						if (getVal) {
							var getType = 4;
							var pinyinReg = /^[a-zA-Z]*$/;
							var shuziReg = /^\d*$/;
							var getVal = this.value;
							if (pinyinReg.exec(getVal)) {
								// 拼音的时候
								getVal = getVal.toUpperCase();
								getType = 3;
							} else if (shuziReg.exec(getVal)) {
								// 编号时
								getType = 2;
							} else {
								// 其他情况,汉字
								getType = 1;
							}
							if (getVal.length > 1) {
								// 返回数据
								$.post('weist/getXingZhengQuHua.action', {
									searchtype : getType,
									searchCode : getVal
								}, function(data) {
									jq_search_suggest_jiguan.empty();
									var jq_inputCode = $("#bmJQ_jiguan");
									var jq_inputName = $("#jiansuo_jiguan");
									xunhuanZiDian2(data,
											jq_search_suggest_jiguan,
											jq_inputCode, jq_inputName);
									jq_search_suggest_jiguan.addClass(
											"divscroll").show();
									jq_inputCode.val("");
								}, 'json');
							}
						} else {
							jq_search_suggest_jiguan.hide();
						}
					});

			// 籍贯默认值
			var jq_jiguan = $("#bmJQ_jiguan");
			var jguanVal = jq_jiguan.val();
			if (jguanVal) {
				$.post(basePath + "weist/getOneXingzheng.action", {
					searchCode : jguanVal
				}, function(data) {
					var code = data.code;
					var name = data.name;
					$("#jiansuo_jiguan").text(name);
				}, 'json');
			}
			// ///检测身份证
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
		});