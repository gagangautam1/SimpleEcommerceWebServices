<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Welcome <%=session.getAttribute("username") %></h1>
<h2>Products in the Cart </h2>

<body>
<% String[] ctg; %>
<% ctg=(String[])(request.getAttribute("cart")); %>
<form id="form2"  >
<% for (int i=0; i<ctg.length; i=i+5){ %>

 <label><b>Product:</b> <%=ctg[i] %> <b>Model:</b> <%=ctg[i+2] %> <b>Price:</b> <%=ctg[i+3] %> </label>

<br>
<%} %>
</form>


<form name="TrainerMenu" action="TrainerMenu" method="get">
   <br>
   <br>
    <input type="button" value="Add Another Item To Cart" name="addtocart2"
    onclick="openPage('ProductCatalog1.jsp')"/>
    <br>
   <br>
    <input type="button" value="Remove Item From cart" name="removecart"
    onclick="openPage('RemoveCart1.jsp')"/>
    <br>
    <input type="button" value="Checkout" name="checkout"
    onclick="openPage('Checkout.jsp')" />
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