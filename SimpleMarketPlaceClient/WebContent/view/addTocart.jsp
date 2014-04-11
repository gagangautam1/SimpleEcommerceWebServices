<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<h1>Welcome <%=session.getAttribute("username") %></h1>
<body>
<h2>Select product to add to cart</h2>
<% String[] ctg; %>
<% ctg=(String[])(request.getAttribute("product")); %>
<form id="form2"  method="post" action="addToCart">
<% for (int i=0; i<ctg.length; i=i+4){ %>

<div class="form-row" > <input type="radio" name="id"  value="<%=ctg[i+1] %>">
<b>Product:</b> <%=ctg[i] %> <b>Model:</b> <%=ctg[i+2] %> <b>Price:</b> <%=ctg[i+3] %> </div>
<br>
<%} %>
<div class="form-row" > <input type="submit" name="Display" value="Add To Cart"  > </div>
</form>
<form id="form4"  method="post" action="DisplayCart">
<br>
<br>
<div class="form-row" > <input type="submit" name="Displaycart" value="Display Cart"  > </div>
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