
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
    background-color: lightblue;
    line-height:2;
}

h1 {
	<center><b><font size="14"></font></b></center>
    color: navy;
    margin-left: 20px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Room Booking</title>
</head>
<body>
<center>
<h1>Book a Room</h1>
<form action="<%=request.getContextPath()%>/HotelController" method="post" onsubmit="return valid()">
First Name:<input type="text" name="firstName"><br>
Last Name:<input type="text"name="lastName" ><br>
Mob. No.:<input type="text"name="contactNo"><br>
Gender:<input type="radio" name="Gender" value="Male" id="male">Male
<input type="radio" name="Gender" value="Female" id="female">Female<br>

DOB:<select name="date">
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
</select><br>
Room Type:<select name="room">
<option>Standard</option>
<option>Deluxe</option>
<option>Executive</option>
<option>Presidential Suite</option>
</select><br>
No. of Guests:<input type="text" name="guestNo"><br>
<input type="submit" value="Book" name="button">
</form>
</center>
</body>
</html>