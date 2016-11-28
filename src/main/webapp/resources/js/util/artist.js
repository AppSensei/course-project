$(document).ready(function() {
	
	$("#request-info").click(function(event) {
		event.preventDefault();
//		$.post( "artist/displayPop", $( "#form").serialize(), function(data) {
//			alert(data);
//		});
		
        $.ajax({
        	
            url : '/course-project/artist/requestBody',
            success : function(data) {
            	alert(data);
            }
        });
		
		return false;
	});	
	
    function crunchifyAjax() {
        $.ajax({
            url : 'ajaxtest.jsp',
            success : function(data) {
                $('#result').html(data);
            }
        });
    }
	
});


