<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>xworkz</title>

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

<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
<a href="index.jsp"> Home </a>

<a class="navbar-brand" href="#"></a> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
		</div>


</div>

</nav>

<div align="center">


	

	<h1>Welcome To SignUp Page</h1>
	
	
<span style = "color:red"> ${message}</span>
	
	
	
	<form name = "myForm" action="signUp" method="post" onsubmit="return validateform()">
	<pre>
	
	UserId<input type="text" name="userId" onchange="onUserId()"> <span id="userIdError"></span>
	 <span id="displayUserName" style="color:red">${userIdExists}</span>
	 
	Email<input type="email" name="email" onchange="onEmail()">
	<span id="display" style="color:red">${emailIdExists}</span>
	
	
	Password<input type="password" name="password" id="userPassword" Onchange="validePassword()"> 
			
	<span id="passwordError"style="color:red">
	</span><input type = "checkbox"onclick="myFunction()">Show Password
	
	ConfirmPassword<input type="password" name="confirmPassword" id="userConfirmPassword"onchange="validePassword()">
	<span id="passwordCompare" style="color:red"></span>
				
	
	Mobile<input type="number" name="mobile" onchange="onMobile()"><span id = "numloc"></span>
	<span id="displayNo" style="color:red"></span>
	
	Accept Agreement <input type="checkbox" id="aggreementId" name="acceptAggreement" onclick="acceptAggrement()">
						
	<input type="submit" id = "submitId" disabled = "true"  />
	
	</pre>

	</form>
	</div>
	
	<h4 style="color:red;">${password}</h4>

<script>


function onEmail(){
	const xhttp = new XMLHttpRequest();
	console.log('Running in ajax');
	xhttp.open("GET", "http://localhost:8081/xworkz-chaitragowdaKR-com/emailId/"+document.myForm.email.value);
	xhttp.send();
	xhttp.onload = function() {
		console.log(this);
		document.getElementById("display").innerHTML = this.responseText
	}

}



function onUserId(){
	const xhttp = new XMLHttpRequest();
	console.log('Running in ajax');
	xhttp.open("GET", "http://localhost:8081/xworkz-chaitragowdaKR-com/userName/"+document.myForm.userId.value);
	xhttp.send();
	xhttp.onload = function() {
		console.log(this);
		document.getElementById("displayUserName").innerHTML = this.responseText
	}

}


function onMobile(){
	const xhttp = new XMLHttpRequest();
	console.log('Running in ajax');
	xhttp.open("GET", "http://localhost:8081/xworkz-chaitragowdaKR-com/mobile/"+document.myForm.mobile.value);
	xhttp.send();
	xhttp.onload = function() {
		console.log(this);
		document.getElementById("displayNo").innerHTML = this.responseText
	}

}



function myFunction() {
	var x = document.getElementById("userPassword");
	if (x.type == "password") {
		x.type = "text";
	} else {
		x.type = "password";
	}
}



	function acceptAggrement(){
		
	var agreement = document.getElementById('aggreementId');
	console.log(agreement.checked);
	if(agreement.checked){
		document.getElementById('submitId').disabled=false;
		
	}else{
		document.getElementById('submitId').disabled='disabled';
		
		}
	}
	
	
	function validateform(){
		
	var userId = document.myForm.userId.value;
	var password = document.myForm.password.value;
	
	if(userId == null || userId=="" ){
		//alert("Name can't be blank");
		document.getElementById('userIdError').innerHTML='Invalid userId';
		return false;
	}
	else if(password.length <6){
		alert("Password must be atleast 6 characters long");
		return false;
	}
	var validNumber =  validateNumber();
	if(!validNumber) {
		return validNumber;
	}
	return validateEmail();
	
	return ValidePassword();
	}
	
	
	function validateNumber(){
		
		var mobile = document.myForm.mobile.value;
		console.log(mobile);
		
		if(isNaN(mobile) ||  mobile == null || mobile==""){
			console.log(mobile.checked);
		document.getElementById("numloc").innerHTML = "Enter Numeric value only";
		return false;
		}
		else{
			return true;
		}
	}
	
	
	function validateEmail(){
		var email = document.myForm.email.value;
		console.log(email)
		var atposition = email.indexOf("@");
		var dotposition = email.lastIndexOf(".");
		
		if(atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){
			alert("Please enter a valid email address\n atposition:"+atposition+"\n dotposition:"+ dotposition);
			return false;
			}
		
	return true;
	}
	
	
	
	function validePassword() {
		var userPassword = document.getElementById('userPassword');
		var userConfirmPassword = document.getElementById('userConfirmPassword');
		var userPasswordvalue = userPassword.value;
		var userConfirmPasswordvalue = userConfirmPassword.value;
		console.log(userPasswordvalue);
		if (userPasswordvalue != null && userPasswordvalue != ""
				&& userPasswordvalue.length > 4
				&& userPasswordvalue.length < 12) {
			if(userPasswordvalue==userConfirmPasswordvalue){
				console.log('valide both password are same');
				document.getElementById('passwordCompare').innerHTML = '';
			}else{
				console.log('valide both password are not same');
				document.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword must be same';
			}
			console.log('valide password');
			document.getElementById('passwordError').innerHTML = '';
		} else {
			console.log('invalide password');
			document.getElementById('passwordError').innerHTML = 'Plese enter valide password';
		}
	}
			
			
		
	
	
		
</script>


</body>
</html>