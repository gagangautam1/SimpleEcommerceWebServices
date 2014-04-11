<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Simple Market Place</title>
</head>
<body>
<form name="TrainerMenu" action="TrainerMenu" method="get">
   
   <h1>Welcome To Simple Market Place<br>Welcome Guest<br></h1>
   <input type="button" value="Sign Up" name="SignUp"
    onclick="openPage('SignUp.jsp')"/>
    <br>
    <br>
   <input type="button" value="login" name="login"
    onclick="openPage('login.jsp')" />
   
    

</form>
<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</body>
</html>