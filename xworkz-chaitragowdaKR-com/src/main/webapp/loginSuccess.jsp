<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
				
				          <li class="active"><a href="index.jsp">Home</a></li>
      <a href="signUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
      <a href="signIn.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a>
    
      
      
      <span style="color: white;">Welcome:${userID}</span>
				
				<img src="download?fileName=${dtoPic}" height="50" width="80">
		</div>
	</nav>
		<div align="center">
	   User Name:${userID}
	</div>
	
<h1 style="color: green;">LOGIN SUCESSFULLY</h1>

  <a href="updateProfile.jsp"><span class="glyphicon glyphicon-log-in"></span> UpdateProfile</a> <br>
      <a href="technology"> Add Technology </a> <br>
       <a href="viewTech?userId=${userID}"> View Technology </a>
</body>
</html>