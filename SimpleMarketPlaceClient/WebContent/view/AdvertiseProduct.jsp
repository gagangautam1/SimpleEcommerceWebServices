<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome <%=session.getAttribute("username") %></h1>
<body>
<div><b>Advertise Your product.<br> Fill in the Details</b></div><br>
<form id="form1"  method="post" action="AdvertiseProduct">
	<div class="form-row" ><span class="label">Category *</span><input type="text" name="category"/></div>
	<div class="form-row" ><span class="label">Name *</span><input type="text" name="name"/></div>
	<div class="form-row" ><span class="label">Model *</span><input type="text" name="model"/></div>
	<div class="form-row" ><span class="label">Price *</span><input type="text" name="price"/></div>
	<div class="form-row" ><input class="submit" type="submit" value="Submit"></div>
<br>
<input type="button" value="logout" name="logout"
    onclick="openPage('Logout.jsp')" />

</form>
<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>

</body>
</html>