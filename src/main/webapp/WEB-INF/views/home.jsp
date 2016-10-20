<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC for Java Developers</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<div class="container">

		<!-- ArtistController -->
		<h1 class="display-3">Artists & Their Albums</h1>

		<%-- 		<c:forEach items="${artists}" var="artist">
			<ul class="list-group">
				<li class="list-group-item"><label>Artist:</label><span>${artist.name}</span></li>
				<li class="list-group-item"><label>Album:</label><span>${artist.title}</span></li>
			</ul>
		</c:forEach>
 --%>

		<c:forEach items="${artists}" var="artist">

			<div class="list-group">
				<a href="#" class="list-group-item list-group-item-action">
					<h5 class="list-group-item-heading">${artist.name}</h5>
					<p class="list-group-item-text">${artist.title}</p>
				</a>
			</div>

		</c:forEach>

		<!-- HomeController -->
		<%-- 		<c:forEach items="${names}" var="name">

			<h2>All Artists</h2>
			<ul class="list-group">
				<li class="list-group-item"><label>Project Name:</label><span>${name.artistId}</span></li>
				<li class="list-group-item"><label>Sponsor:</label><span>${name.name}</span></li>
			</ul>
		</c:forEach> --%>




	</div>
</body>
</html>