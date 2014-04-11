<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%=session.getAttribute("username") %></h1>
<div><b>Fill in the Card Details</b></div><br>
<form id="form1"  method="post" action="Checkout">
	<div class="form-row" ><span class="label">Card Holder's Name' *</span><input type="text" name="user"/></div>
	<div class="form-row" ><span class="label">Credit Card Number *</span><input type="text" name="cardnumber"/></div>
	<div class="form-row" ><span class="label">CVV Number *</span><input type="text" name="cvv"/></div>
	<div class="form-row" ><span class="label">Card Expiry Date *</span><input type="text" name="exp_date"/></div>
	<div class="form-row" ><span class="label">Email *</span><input type="text" name="email"/></div>
	<div class="form-row" ><input class="submit" type="submit" value="Payment" onclick="cardnumvalidate(cardnumber)"></div>
	<br>
<input type="button" value="logout" name="logout"
    onclick="openPage('Logout.jsp')" />

</form>

<script type="text/javascript"><script type="text/javascript">
function cardnumvalidate(num)  
{  
  var no = /^(?:3[47][0-9]{13})$/;  
  if(inputtxt.value.match(no))  
        {  
      return true;  
      
        }  
      else  
        {  
        alert("Enter a Valid card number");  
        return false;  
        }  
} 
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</body>
</html>