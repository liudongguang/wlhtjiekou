$(document).ready(
		function() {
			var basePath = $("#basePH").val();
			var getZidianStrVal = $("#getZidianStr").val();
			$.post(basePath + 'weist/testZidian', {
				getZidianStr : getZidianStrVal
			}, function(data) {
				var dwlxData = data['dwlx'];
				var jq_selectDWLX = $("#dwlx_id");
				xunhuan(jq_selectDWLX, dwlxData);
				// ///设置默认值
				var dwlxVal = $("#forSel_dwlx_ID").val();
				if (dwlxVal) {
					jq_selectDWLX.val(dwlxVal);
				}
			}, 'json');
			// ////////////////////////////////////////////////////
			var jgID = $("#jg_ID").val();
			$.post(basePath + 'weist/getAllHJginfoRemoveSelf', {
				handlerId : jgID
			}, function(data) {
				var dwlxData = data['dw'];
				var jq_selectsjDW = $("#sjdw_id");
				xunhuanaddJG(jq_selectsjDW, dwlxData);
				// ///设置默认值
				var dwlxVal = $("#forSel_sjdw_ID").val();
				if (dwlxVal) {
					jq_selectsjDW.val(dwlxVal);
				}
			}, 'json');
			// /////////////////////////////////////
			var forRadio_yhbs_IDVal = $("#forRadio_yhbs_ID").val();
			if (forRadio_yhbs_IDVal) {
				$(
						"input[type='radio'][name='searchByJg.yhbs'][value="
								+ forRadio_yhbs_IDVal + "]").attr("checked",
						true);
			}
			// //////////
			$("#forBackBt").click(function() {
				window.location.href = basePath + "weist/getAllJiGou.action";
			});
			$("#subRLForm").submit(
					function() {
						var strInputs = $("input[type='text'][str]");
						var trState = true;
						strInputs.each(function() {
							var thisStrInput = $(this);
							var inputVal = $.trim(thisStrInput.val());
							if (!inputVal) {
								// 没有值的时候
								var tishiText = thisStrInput.parent().prev()
										.text();
								alert(tishiText.substring(1,
										tishiText.length)
										+ " 不能为空！");
								trState = false;
								return false;
							}
						});
						return trState;
					});
			$("input[id^='check_']").each(function() {
				var thisCheckInput = $(this);
				thisCheckInput.blur(function() {
					var thisBlur = $(this);
					var check_ZiDuan = thisBlur.attr("id").split("_")[1];
					var checkVal = thisBlur.val();
					if (checkVal) {
						// 检查
						$.post(basePath + "weist/checkIsExsit", {
							checkProperty : check_ZiDuan,
							checkVal : checkVal
						}, function(data) {
                             var getMsg=data['msg'];
                             //没有会返回true
                             if(!getMsg){
                            	 thisBlur.val("");
                            	 var parenttdText=thisBlur.parent().prev().text();
                            	 alert(parenttdText.substring(1,parenttdText.length)+ "  已存在！");
                            	 thisBlur.focus();
                             }
						}, 'json');
					}
				});
			});
		});