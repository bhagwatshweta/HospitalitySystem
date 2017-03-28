<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Hotel Garden Paradise!</title>

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
<center><b><font size="14" style=Cursive>Welcome to Hotel Garden Paradise!</font></b></center>
<a href="JSP/CreateGuest.jsp">Create Guest Details</a><br>
<a href="JSP/ViewGuest.jsp">View Guest Details</a><br>
<a href="JSP/UpdateGuest.jsp">Update Guest Details</a><br>
<a href="JSP/DeleteGuest.jsp">Delete Guest Details</a><br>
<a href="JSP/RegisterAdmin.jsp">New Admin Registration</a><br>

</center>
</body>
</html>