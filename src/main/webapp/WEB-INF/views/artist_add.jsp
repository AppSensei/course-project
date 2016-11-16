<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Artist & Albums</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>"
	type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<div class="container">

		<div class="row">

			<spring:url value="/artist/add" var="artistAddRequest" />
			<form:form action="${artistAddRequest}" method="POST" modelAttribute="artist"
				cssClass="col-md-8 col-md-offset-2">

				<div class="form-group">
					<label for="name">Artist Name</label>
					<form:input path="name" cssClass="form-control" id="name" />
				</div>

				<div class="form-group">
					<label for="title">Album Title One</label>
					<form:input path="albums[0].title" cssClass="form-control" id="title" />
				</div>

				<div class="form-group">
					<label for="title">Album Title One</label>
					<form:input path="albums[1].title" cssClass="form-control" id="title" />
				</div>

				<div class="form-group">
					<label for="title">Album Title One</label>
					<form:input path="albums[2].title" cssClass="form-control" id="title" />
				</div>


				<button type="submit" class="btn btn-default">Submit</button>
			</form:form>

		</div>

	</div>


</body>
</html>