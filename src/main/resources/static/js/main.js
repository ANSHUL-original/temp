add = function (){
		var search={};
		search["uName"] = $("#uName").val();
		search["uTech"] = $("#uTech").val();
		alert(search);
		$("#submitButton").prop("disabled", true);

	    $.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "/adduser",
	        data: JSON.stringify(search),
	        
	        success: function (data) {

	        	$("#showTable").html(data);

	            console.log("SUCCESS : ", data);
	            $("#submitButton").prop("disabled", false);

	        },
	        error: function (e) {
	            var json = "<h4>Ajax Response</h4><pre>"
	                + e.responseText + "</pre>";
	            $("#showTable").html(json);

	            console.log("ERROR : ", e);
	            $("#submitButton").prop("disabled", false);

	        }
	        
	    });
}

up = function(value){
	    	var search=value;
		    $.ajax({
		        type: "POST",
		        contentType: "application/json",
		        url: "updateuser/"+search,
		        data: JSON.stringify(search),
		        success: function (data) {
					alert(data);
					$("#showTable").html(data);
		            console.log("SUCCESS : ", data);
		        }
		    });
}

del = function(value){
	var search=value;
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "deleteuser/"+search,
        data: JSON.stringify(search),
        success: function (data) {
			alert(data);
			$("#showTable").html(data);
            console.log("SUCCESS : ", data);
        }
    });
}

filter = function(){
	var search = $("#uTech").val();
    $("#submitButton").prop("disabled", true);

    $.ajax({
    	alert("hello");
        type: "POST",
        contentType: "application/json",
        url: "filterFun/"+search,
        data: JSON.stringify(search),
        success: function (data) {

        	$("#showTable").html(data);

            console.log("SUCCESS : ", json);
            $("#submitButton").prop("disabled", false);

        },
        error: function (e) {
            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $("#showTable").html(json);

            console.log("ERROR : ", e);
            $("#submitButton").prop("disabled", false);

        }
        
    });
}
/*
$(document).ready(
			function(){
				$("#userForm").submit(
					function(event){
						event.preventDefault();
				        fire_ajax_submit();
					});
			});
	function fire_ajax_submit(){
		var search = $("#uTech").val();
		alert("filter");
	    $("#submitButton").prop("disabled", true);

	    $.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "${pageContext.request.contextPath}/filterTechnology/"+search,
	        data: JSON.stringify(search),
	        success: function (data) {

	        	$("#showTable").html(data);

	            console.log("SUCCESS : ", json);
	            $("#submitButton").prop("disabled", false);

	        },
	        error: function (e) {
	            var json = "<h4>Ajax Response</h4><pre>"
	                + e.responseText + "</pre>";
	            $("#showTable").html(json);

	            console.log("ERROR : ", e);
	            $("#submitButton").prop("disabled", false);

	        }
	        
	    });
	}

$(document).ready(
			function(){
				$("#updateId").click(
					function(event){
						event.preventDefault();
						update_ajax();
					});
			});
	function update_ajax(){
		var search1=$("#userId").val();
		alert("update");
		$("#submitButton").prop("disabled", true);
	    $.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "updateuser/"+search1,
	        data: JSON.stringify(search1),
	        success: function (data) {
				alert(data);
	            console.log("SUCCESS : ", data);
	        }
	    });
}
	
$(document).ready(
			function(){
				$("#deleteId").click(
					function(event){
						event.preventDefault();
						delete_ajax();
					});
			});
	function delete_ajax(){
		var search2=$("#userId").val();
		alert("delete");
		$("#submitButton").prop("disabled", true);
	    $.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "deleteuser/"+search2,
	        data: JSON.stringify(search2),
	        success: function (data) {
				alert(data);
	            console.log("SUCCESS : ", data);
	        }
	    });
}

	$(document).ready(
			function(){
				$("#userForm").submit(
					function(event){
						event.preventDefault();
				        fire_ajax_submit();
					});
			});
	function fire_ajax_submit(){
		var search={}
		search["uName"] = $("#uName").val(),
		search["uTech"] = $("#uTech").val()
	    
		$("#submitButton").prop("disabled", true);

	    $.ajax({
	        type: "POST",
	        contentType: "application/json",
	        url: "/adduser",
	        data: JSON.stringify(search),
	        
	        success: function (data) {

	        	$("#showTable").html(data);

	            console.log("SUCCESS : ", data);
	            $("#submitButton").prop("disabled", false);

	        },
	        error: function (e) {
	            var json = "<h4>Ajax Response</h4><pre>"
	                + e.responseText + "</pre>";
	            $("#showTable").html(json);

	            console.log("ERROR : ", e);
	            $("#submitButton").prop("disabled", false);

	        }
	        
	    });
	}
*/