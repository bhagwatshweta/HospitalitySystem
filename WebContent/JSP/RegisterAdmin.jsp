<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body { 
background-image: url(img/e.jpg); 
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

table {
    border-collapse: collapse;
    
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
</style>
  
<title>Register</title>
</head>
<body>

<marquee><h1>Hotel Garden Paradise</h1></marquee>
<div class="container">
    <ul class="nav nav-tabs">
    <li class="active"><a href="Login.jsp">Home</a></li>
    <li><a href="aboutus.jsp">About Us</a></li>
    <li><a href="Facilities.jsp">Facilities</a></li>
    <li><a href="contactus.jsp">Contact</a></li>
    <li><a href="LogReg.jsp">Login/Register</a></li>
  </ul>
<center>
<form action="<%=request.getContextPath()%>/RegisterController" method="post" onsubmit="return valid()">
<table>

<tr><td><h2>Create Account</h2></td></tr>
<tr>
<td>Admin Name:</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>D.O.B. :</td>
<td>DOB:<select name="date">
<% for(int i=1;i<=31;i++){ %>
<option><%=i%></option>
<%} %>
</select>
<select name="month">
<% for(int i=1;i<=12;i++){ %>
<option><%=i%></option>
<%} %>
</select>
<select name="year">
<% for(int i=1980;i<=1994;i++){ %>
<option><%=i%></option>
<%} %>
</select><br></td>
</tr>
<tr>
<td>Email Id:</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>

<tr>
<td>Nationality:</td>
<td><input type="text" name="nationality"></td>
</tr>
<tr>
<td>User Type:<select name="User_type">
<option>Admin</option>
<!-- <option>Guest</option> -->
</select><br>
</td>
</tr>
<tr>
<td><input type="submit" value="Submit" name="button"></td>
<td><input type="submit" value="clear" name="clr"></td>
</tr>

</table>
</form>
</center>

</div>

</body>
</html>