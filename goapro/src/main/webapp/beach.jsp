<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>


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

				<a href="index.jsp">Home </a> 
		</div>



	</nav>

	<h1>Welcome To Beach</h1>



<form action="beach" method="post">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter beach name">
		</div>
		
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Location</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter location">
		</div>
		

		

		<div>
			<label for="exampleFormControlInput1" class="form-label">Select	Games</label> 
			 <select class="form-select" multiple aria-label="multiple select example" name="games">    
				<option value="Parasailing">KanJam</option>
				<option value="Windsurfing">BoomBeach</option>
				<option value="Jet skiing">Jet skiing</option>
				<option value="Ringo Ride">Ringo Ride</option>
				<option value="Kayaking">PaddelBall</option>
				<option value="Scuba Diving">Scuba Diving </option>
				<option value="Speed boats">Speed boats</option>
				<option value="River Rafting">River Rafting</option>
			</select>
		</div>
		
		<label for="exampleFormControlInput1" class="form-label">Clean: </label> 
		<div class="form-check">
		
			<input class="form-check-input" type="radio" name="clean"
				id="flexRadioDefault1" value="true"> <label class="form-check-label"
				for="flexRadioDefault1"> Yes </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="clean"
				id="flexRadioDefault2" value="false"> <label
				class="form-check-label" for="flexRadioDefault2"> No </label>
		</div>
		&nbsp;
		<input type="submit" class="btn btn-success" value="Send">

		
	</form>





</body>
</html>