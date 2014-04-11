<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1> Welcome <%=session.getAttribute("username") %> </h1>
<body>

<form name="TrainerMenu" action="TrainerMenu" method="get">
   
    <input type="button" value="Advertise Product" name="advertise"
    onclick="openPage('AdvertiseProduct.jsp')"/>
    <br>
    <br>
    <input type="button" value="Product Catalog" name="products"
    onclick="openPage('ProductCatalog1.jsp')"/>
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