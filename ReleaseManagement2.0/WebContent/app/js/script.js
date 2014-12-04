$(document).ready(function(){
	/*$("#screen1").show();
	$("#screen2").hide();
	$("#screen3").hide();
	$("#releaseButton").mouseover(function(){
		$("#screen1").fadeOut(100);
		$("#screen3").fadeOut(200, function(){
			$("#screen2").fadeIn(200);
		});
	});
	$("#iterationButton").mouseover(function(){
		$("#screen1").fadeOut(100);
		$("#screen2").fadeOut(200, function(){
			$("#screen3").fadeIn(200);
		});
	});*/
	$("#box1").show();
	$("#box2").hide();
	$("#link").hide();
	$("#startButton").click(function(){
		$("#box1").hide();
		$("#box2").show();
		$("#link").fadeIn(400);
	});
});
/*function showBox() {
	document.getElementById("box1").style.display = "none";
	document.getElementById("box2").style.display = "block";
	document.getElementById("link").style.display = "block";
}*/