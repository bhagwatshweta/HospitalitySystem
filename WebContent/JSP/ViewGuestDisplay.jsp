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
<title>Viewing Details</title>
</head>
<body>
<center>

Guest Details are as follows:

<table>
<tr><td>GuestID:<%=request.getAttribute("gue") %></td></tr>
<tr><td>First Name:<%=request.getAttribute("fNam") %></td></tr>
<tr><td>Last Name:<%=request.getAttribute("lNam") %></td></tr>
<tr><td>Mobile No.:<%=request.getAttribute("con") %></td></tr>
<tr><td>Gender:<%=request.getAttribute("gen") %></td></tr>
<tr><td>Date of Birth:<%=request.getAttribute("dob") %></td></tr>
<tr><td>Room Type:<%=request.getAttribute("roo") %></td></tr>
<tr><td>No. of Guests Staying:<%=request.getAttribute("gNo") %></td></tr>

</table>

</center>
</body>
</html>