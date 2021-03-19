$(document).ready(function() {
	$("#userForm").submit(function(event) {
		event.preventDefault();
		fire_ajax_submit();
	});
});
function fire_ajax_submit() {
	var search = $("#uTech").val();

	$("#submitButton").prop("enable", true);

	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "${pageContext.request.contextPath}/filterTechnology/" + search,
		data : JSON.stringify(search),
		success : function(data) {

			$("#showTable").html(data);

			console.log("SUCCESS : ", json);
			$("#submitButton").prop("disabled", false);

		},
		error : function(e) {
			var json = "<h4>Ajax Response</h4><pre>" + e.responseText
					+ "</pre>";
			$("#showTable").html(json);

			console.log("ERROR : ", e);
			$("#submitButton").prop("disabled", false);

		}

	});
}