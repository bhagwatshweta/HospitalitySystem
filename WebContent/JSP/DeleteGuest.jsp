<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
    background-color: lightblue;
    
}

h1 {
	<center><b><font size="14"></font></b></center>
    color: navy;
    margin-left: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guest Deletion</title>
</head>
<body>
<center>
<h1>Delete a Guest Entry</h1>
<form action="../HotelController" method="post" onsubmit="return valid(myForm)" name="myForm">
Guest Id:<input type="text" name="guestId"><br>
<input type="submit" value="Delete" name="button">
</form>
</center>
</body>
</html>