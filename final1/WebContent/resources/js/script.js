$(document).ready(function(){
	$("#screen1").show();
	$("#screen2").hide();
	$("#screen3").hide();
	$("#releaseButton").click(function(){
		$("#screen1").fadeOut(200);
		$("#screen3").fadeOut(400, function(){
			$("#screen2").fadeIn(400);
		});
	});
	$("#iterationButton").click(function(){
		$("#screen1").fadeOut(200);
		$("#screen2").fadeOut(400, function(){
			$("#screen3").fadeIn(400);
		});
	});
});
function showBox() {
	document.getElementById("box1").style.display = "none";
	document.getElementById("box2").style.display = "block";
}