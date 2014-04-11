<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><b>Sign Up For a New Account</b></div><br>
<form id="form1"  method="post" action="SignUp">
	<div class="form-row" ><span class="label">Username *</span><input type="text" name="user"/></div>
	<div class="form-row" ><span class="label">Password *</span><input type="password" name="pass"/></div>
	<div class="form-row" ><span class="label">Email *</span><input type="text" name="email"/></div>
	<div class="form-row" ><span class="label">Home Phone *</span><input type="text" name="hpone"/></div>
	<div class="form-row" ><span class="label">Work Phone *</span><input type="text" name="wpone"/></div>
	<div class="form-row" ><span class="label">Address *</span><input type="text" name="address"/></div>
	<div class="form-row" ><input class="submit" type="submit" value="Submit"></div>
</form> 
</body>
</html>