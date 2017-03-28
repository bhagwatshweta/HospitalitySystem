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
}</style>

<script>
function submitFunction(i) {
	   if (i==1) 
		  { 
		   if(document.frm.uName.value=="")
		   
		    {
		      alert("UserName or password should not be left blank");
		      document.frm.uName.focus();
		      //reload();
		      return false;
		    }
		   else
		   window.location="adminLogin.jsp";
		  }
	   if (i==2) 
		   {
		   if(document.frm.uName.value=="")
		   {
		      alert("User Name or password should not be left blank");
		      document.frm.uName.focus();
		      //reload();
		      return false;
		   }
		   else
		   window.location="guestLogin.jsp";
		   }
	   document.theForm.submit()
	   }
	   
function register(){
	 window.location="registration.jsp";
	
}	   
function validateForm()
{
    if(document.frm.uName.value=="")
    {
      alert("User Name should not be left blank");
      document.frm.uName.focus();
      //reload();
      return false;
    }
    else if(document.frm.pass.value=="")
    {
      alert("Password should not be left blank");
      document.frm.pass.focus();
     return false;
    }
}
 </script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Garden Paradise Login</title>

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
  </div>
<center>
<form action="<%=request.getContextPath()%>/LoginController" method="post" onsubmit="return valid()">
<!-- <form name="frm" method="post" onSubmit="return validateForm()"> -->
<%-- <form action="<%=request.getContextPath()%>/LoginController" method="post" onsubmit="return valid()"> --%>
<table>
<tr><td align="right">User name:</td><td><input type="text" name="uName"></td></tr>
<tr><td align="right">PassWord:</td><td><input type="password" name="pass"></td></tr>
<tr><td align="right">Login As: </td>
	<td>
	<INPUT TYPE="submit" VALUE="Admin" name="button" onClick="submitFunction(1);">
	<INPUT TYPE="submit" VALUE="Guest" name="button" onClick="submitFunction(2);">
	</td>
</table>
</form>
<a href="registration.jsp">Create Account</a>
</center>
</body> 




</html>