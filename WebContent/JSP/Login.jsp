<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body { 
background-image: url("images/hotel.jpg"); 
 background-size: 100%;
background-repeat: no-repeat; 
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
  
<script>
$(document).ready(function(){
    $(".nav-tabs a").click(function(){
        $(this).tab('show');
    });
});
</script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Garden Paradise Login</title>

</head>

 <body>
 <marquee><h1>Hotel Garden Paradise</h1></marquee>
<div class="container">
    <ul class="nav nav-tabs">
    <li class="active"><a href="JSP/Login.jsp">Home</a></li>
    <li><a href="JSP/aboutus.jsp">About Us</a></li>
    <li><a href="JSP/Facilities.jsp">Facilities</a></li>
    <li><a href="JSP/contactus.jsp">Contact Us</a></li>
    <li><a href="JSP/LogReg.jsp">Login/Register</a></li>
  </ul>
<h1>Welcome to Hotel Garden Paradise</h1>
<hr>

 
<!--  <img src="img/hotelgarden.png" width="304" height="228"> -->
</div>

<%-- <img src="<%=request.getContextPath()%>/img/hotel.jpg"></img> --%>


  
</body>

<!-- <body>
<center>
<h1>Login</h1>
<form name="frm" method="get" action="JSP/Welcome.jsp" onSubmit="return validateForm()">
<table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td width="22%">&nbsp;</td>
    <td width="78%">&nbsp;</td>
    </tr>
  <tr>
    <td>UserName </td>
    <td><input type="text" name="username" /></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="text" name="pwd" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="submit" value="Submit"></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
</table>
</form>
</center>
</body> -->




</html>