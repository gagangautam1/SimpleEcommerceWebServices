<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Catalog</title>
</head>
<h1>Welcome <%=session.getAttribute("username") %></h1>
<h2> Select The category to display Products</h2>

<body>
<% String[] ctg; %>
<% ctg=(String[])(request.getAttribute("category")); %>
<form id="form2"  method="post" action="ProductCatalog">
<% for (int i=0; i<ctg.length; i++){ %>

<div class="form-row" > <input type="radio" name="category"  value="<%=ctg[i] %>"><%=ctg[i] %> </div>
<br>
<%} %>
<div class="form-row" > <input type="submit" name="Display" value="Display"  > </div>
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