<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC for Java Developers</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	

	<div class="container">
		<div class="row">
			<form action="<spring:url value="/student/add" /> method="post"
				class="col-md-8 col-md-offset-2">


				<div class="form-group">
					<label for="name">Name</label> <input type="text"
						id="name" class="form-control" name="name" />
				</div>

				<div class="form-group">
					<label for="enrollment_type">Enrollment Information</label> <select name="type"
						class="selectpicker">
						<option></option>
						<option value="full">Full-time</option>
						<option value="part">Part-time</option>
					</select>
				</div>

				<div class="form-group">
					<label for="guardian">Guardian</label>
					 <input id="guardian" type="text" class="form-control" name="guardian" />
				</div>

				<div class="form-group">
					<label for="tution">Tution Costs</label> 
					<input id="funds" type="text" class="form-control" name="tution-costs" />
				</div>

				<div class="form-group">
					<label for="hours">Authorized Hours</label> 
					<input id="hours" type="text" class="form-control" name="authorized_hours" />
				</div>

				<div class="form-group">
					<label for="project-name">Description</label>
					<textarea name="description" class="form-control" rows="3"></textarea>
				</div>

			</form>
</body>
</html>