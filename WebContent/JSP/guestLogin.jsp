<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guest</title>
<style type="text/css">
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
}</style>
</head>
<body>
 <marquee><h1>Hotel Garden Paradise</h1></marquee>
<div class="container">
    <ul class="nav nav-tabs">
    <li class="active"><a href="JSP/Login.jsp">Home</a></li>
    <li><a href="JSP/aboutus.jsp">About Us</a></li>
    <li><a href="JSP/Facilities.jsp">Facilities</a></li>
    <li><a href="JSP/contactus.jsp">Contact</a></li>
    <li><a href="JSP/Login.jsp">Logout</a></li>
  </ul>
  </div>
  <center>
  </br>
  </br>
  <a href="JSP/BookRoom.jsp">Book a Room</a><br>
  <a href="JSP/BookTable.jsp">Book a Table</a><br>
  <a href="JSP/OrderFood.jsp">Order Food</a><br>
  </center>


</body>
</html>