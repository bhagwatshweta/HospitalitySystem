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
<title>Insert title here</title>
</head>
<body>
<center>
<form action="../HotelController" method="post" onsubmit="return valid(myForm)" name="myForm">
<h1>Update Guest Registration</h1>

Guest Id:<input type="text" name="guestId"><br>
First Name:<input type="text" name="firstName"><br>
Last Name:<input type="text"name="lastName" ><br>
Mobile No.:<input type="text"name="contactNo"><br>
Room:
<select name="room">
<option>Standard</option>
<option>Deluxe</option>
<option>Executive</option>
<option>Presidential Suite</option>
</select><br>

<input type="submit" value="Update" name="button">
</form>
</center>
</body>
</html>