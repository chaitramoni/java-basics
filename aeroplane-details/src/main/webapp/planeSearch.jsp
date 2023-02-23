<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Xworkz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand"><img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="48" class="d-inline-block align-text-top"></a>

		<form class="d-flex">

			<a href="plane"> Plane </a>
			<a href="index.jsp"> Home </a>
			


		</form>

	</div>

	</nav>
	
	<h1>Plane Search</h1>
	<h3><span style = "color:red">${message}</h3>
	<form action = "search" method = "get">
	
	
	
	Search By Id<input type = "text" name = "id"/>
	<input type = "submit" value = "search"/>
	</form>
	
	<div>
	<h3>Search Results:</h3>
	Company:${dto.company}</br>
	Name:${dto.name}</br>
	Cost:${dto.cost}</br>
	Type:${dto.type}</br>
	Country:${dto.country}</br>
	</div>
	
	<body>
	
	<form action="search" method ="post"></form>
	
	</body>
	</body>
	</form>





</html>