$(document).ready(function () {
	$('.btn').click(function (e) {
		e.preventDefault();
		var id = $("#id").val();
		$.ajax({
			url: 'http://localhost:8080/task/' + id,
			success: function (response) {
				$("#app").empty();
				$("#err").empty();
				$("#app").html(`<h1 id="title"></h1><hr><label id="string"></label>`);
				$("#title").text("主题" + id);
				$("#string").text(response.string);
			},
			error: function(error){
				$("#app").empty();
				$("#err").empty();
				$("#err").html(`<h1 class="alert-danger">`+error.responseJSON.message+`</h1>`);
			}
		});
	});
});