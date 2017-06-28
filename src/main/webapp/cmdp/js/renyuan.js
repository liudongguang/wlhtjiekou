$(document).ready(
		function() {
			var basePath = $("#basePH").val();
			var zidianState = $("#zidianState").val();
			// ////////////检索
			// /出院科室
			var jq_search_suggest_jiguan = $("#search_suggest_jiguan");
			$("#jiansuo_szks").keyup(
					function() {
						var getVal = $(this).val();
						if (getVal) {
							var getType = 4;
							var pinyinReg = /^[a-zA-Z]*$/;
							var shuziReg = /^\d*.?\d*$/;
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
							// 返回数据
							$.post(basePath + 'cmdphd/getKSFromYY.action', {
								searchtype : getType,
								searchCode : getVal
							}, function(data) {
								jq_search_suggest_jiguan.empty();
								var jq_inputCode = $("#szks_hide");
								var jq_inputName = $("#jiansuo_szks");
								xunhuanZiDian2(data, jq_search_suggest_jiguan,
										jq_inputCode, jq_inputName);
								jq_search_suggest_jiguan.addClass("divscroll")
										.show();
								jq_inputCode.val("");
							}, 'json');
						} else {
							$("#szks_hide").val("");
							jq_search_suggest_jiguan.hide();
						}
					});
			// ///////////
			$("#subRLForm").submit(
					function() {
						var strInputs = $("input[type='text'][str]");
						var notnullComs = $("[notnull]");
						var numInputs = $("input[type='text'][num]");
						var trState = true;
						strInputs.each(function() {
							var thisStrInput = $(this);
							var inputVal = $.trim(thisStrInput.val());
							if (!inputVal) {
								// 没有值的时候
								var tishiText = thisStrInput.parent().prev()
										.text();
								alert(tishiText.substring(1, tishiText.length)
										+ " 不能为空！");
								thisStrInput.focus();
								trState = false;
								return false;
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
								var tishiText = thisNumInput.parent().prev()
										.text();
								alert(tishiText.substring(1, tishiText.length)
										+ " 不能为空！");
								thisNumInput.focus();
								trState = false;
								return false;
							} else {
								// 必须为数字
								var reg = new RegExp("^[0-9]*$");
								if (!reg.test(inputVal)) {
									var tishiText = thisNumInput.parent()
											.prev().text();
									alert(tishiText.substring(1,
											tishiText.length)
											+ " 请输入数字!");
									thisNumInput.focus();
									trState = false;
									return false;
								}
							}
						});
						if (!trState) {
							return trState;
						}
						notnullComs.each(function() {
							var thisStrInput = $(this);
							var inputVal = $.trim(thisStrInput.val());
							if (!inputVal) {
								// 没有值的时候
								var tishiText = thisStrInput.parent().prev()
										.text();
								alert(tishiText.substring(1, tishiText.length)
										+ " 不能为空！");
								trState = false;
								return false;
							}
						});
						return trState;
					});
			// 验证身份证
			$("input[id^='unique']['card']").blur(function() {
				var jq_this = $(this);
				var value = jq_this.val();
				var ids = jq_this.attr("id").split("_");
				var idStartVal=$("#idSate").val();
				if(value){
					$.post(basePath + "cmdphd/validateShenFenZheng.action", {
						valuse : value
					}, function(data) {
						var rtMsg = data['message'];
						if (rtMsg) {
							alert(rtMsg);
							// jq_this.val("").focus();
						}
					}, 'json');
				}
				// 0.标识 1.表名 2.字段
				if (value&&!idStartVal) {
					$.post(basePath + 'cmdphd/getCountByTable', {
						tableName : ids[1] + "_",
						ziduan : ids[2] + "_",
						valuse : value
					}, function(data) {
						var rtData = data['my_msg'];
						if (rtData == 0) {

						} else {
							alert(rtData);
							jq_this.val("");
							jq_this.focus();
						}
					}, 'json');
				}
			});
			$("#forBackBt").click(function() {
				history.back(1);
			});
		});