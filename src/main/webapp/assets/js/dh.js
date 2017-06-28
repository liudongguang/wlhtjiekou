$(document).ready(function() {
	//主菜单事件
		$(".main > a").click(function() {
			//1.把其他打开子菜单隐藏
				var ulNode = $(this).next("ul");
				if(ulNode.css("display")== "none")
					{
				    ulNode.css("display", "block");
					}
					else
					{
					ulNode.css("display", "none");
					}
				})
				$(".main1 > a").click(function() {
			//1.把其他打开子菜单隐藏
				var ulNode1 = $(this).next("ul");
				if(ulNode1.css("display")== "none")
					{
				    ulNode1.css("display", "block");
					}
					else
					{
					ulNode1.css("display", "none");
					}
				})				
	});				
