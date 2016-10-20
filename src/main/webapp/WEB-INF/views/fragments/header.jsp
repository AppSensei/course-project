<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
	<div class="container-fluid">

		<div class="navbar-header">
			<a class="navbar-brand" href="#">FunTunes</a>
		</div>

		<ul class="nav navbar-nav">

			<li>
				<a href="#">Home</a>
			</li>

			<li class="dropdown">

				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-expanded="false">Artists <span class="caret"></span></a>

				<ul class="dropdown-menu" role="menu">
					<li>
						<a href="<spring:url value="/artist/add"/>">Add</a>
					</li>
					<li>
						<a href="#">Find</a>
					</li>
				</ul>

			</li>

			<li class="dropdown">

				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-expanded="false">Albums<span class="caret"></span></a>

				<ul class="dropdown-menu" role="menu">
					<li>
						<a href="#">Add</a>
					</li>
					<li>
						<a href="#">Find</a>
					</li>
				</ul>

			</li>

		</ul>

	</div>
</nav>