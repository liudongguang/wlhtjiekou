$(document).ready(
		function() {
			var basePath = $("#basePH").val();
			// //////////
			$("#forBackBt").click(
					function() {
						window.location.href = basePath
								+ "weist/getAllGonghuiHuiYuanXInxi";
					});
			$("#subRLForm").submit(
					function() {
						var strInputs = $("input[type='text'][str]");
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
									trState = false;
									return false;
								}
							}
						});
						return trState;
					});

		});