

var javaCourse = {title:"Java", type:"programming", desc:"Java courses", img:"resources/img/java.png"};	
var photoshop = {title:"Photoshop", type:"photo", desc:"Photoshop courses", img:"resources/img/photoshop.png"};
var webdesign = {title:"Web-design", type:"design", desc:"Web-design courses", img:"resources/img/webdesign.png"};
var javaScript = {title:"JavaScript", type:"programming", desc:"JavaScript courses", img:"resources/img/javascript.png"};
var python = {title:"Python", type:"programming", desc:"Python courses", img:"resources/img/Python.png"};
var corel = {title:"Corel", type:"photo", desc:"Corel courses", img:"resources/img/corel.png"};
var courses = [javaCourse, javaScript, photoshop, webdesign, python, corel];


$( document ).ready(function() {
	for (index = 0; index < courses.length; ++index) {		
		jQuery('<div/>', {
			class: 'panel coursesList',
			text: courses[index].title,
			id: courses[index].title 
		}).appendTo('#coursesId');
	}
});

$(document).ready(function(){
	$("#programmingId, #photoId, #designId, #allId").click(function(){  
		for (index = 0; index < courses.length; ++index) {
			if (this.id != "allId" && courses[index].type +"Id" != this.id) {
				$('#' + courses[index].title).hide();
			} 
			else if (this.id == "allId"){			 
				$('#' + courses[index].title).show();		
			} else if (this.id != "allId" && courses[index].type +"Id" == this.id) {
				$('#' + courses[index].title).show();	
			}
		}
	});
});

$(document).ready(function(){
	$(".coursesList").click(function(){  
		for (index = 0; index < courses.length; ++index) {
			if (courses[index].title == this.id) {
				$("#description span").text(courses[index].desc);				
				$("#description img").attr("src", courses[index].img);
			}
		}	
	});
});

$(document).ready(function(){
	$("#textSearch").keyup(function(){		
		$("#coursesId div").each(function(){
			$(this).html($(this).html().replace("<span>", ""));
			$(this).html($(this).html().replace("</span>", ""));
		}); 		
		var text = $(this).val();
		$("#coursesId div").each(function(){
			$(this).html($(this).html().replace(new RegExp(text, "i"), "<span>"+ text + "</span>"));					
		}); 	
	});
});

$("#ajbutton").click(function(){
		$.getJSON("qwerty.json", function(data){
			alert("dfsdfsdf");
	});
		alert("df");
});
