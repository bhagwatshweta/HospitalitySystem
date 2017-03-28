<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Food Order</title>
<style>
table {
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
}
</style>
</head>
<body>

<center>
<h2>Menu card</h2>
<form action="<%=request.getContextPath()%>/OrderController" method="post" onsubmit="return valid()">

<table>
<tr>
<th>Menu</th>
<th>Quantity</th>
<th></th>
</tr>
<tr>
	<td>Roti</td>
	<td><input type="text" name="qt1" ></td>
	<td><input type="checkbox" name="food" value="roti"><br></td>
</tr>
<tr>
	<td>Curry</td>
	<td><input type="text" name="qt2" ></td>
	<td><input type="checkbox" name="food" value="curry"><br></td>
</tr>
<tr>
	<td>Biryani</td>
	<td><input type="text" name="qt3" ></td>
	<td><input type="checkbox" name="food" value="biryani"><br></td>
</tr>
</table>
	<INPUT TYPE="submit" VALUE="order" name="button">
</form>
</center>
</body>
</html>