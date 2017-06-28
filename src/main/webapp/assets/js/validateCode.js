function clchangeCode() {
	var basePath=document.getElementById("basePath").value;
	document.getElementById("sec").src = basePath+"myutil/createValidateAction.action?d+"
			+ new Date().getTime();
}