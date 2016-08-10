<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up</title>
</head>
<body>
	<table border="0" width="1000" align="center">
		<tr bgcolor="skyblue">
			<th><a href="ListProducts?action=see">Productos</a></th>
			<th><a href="LogIn">Loguearse</a></th>
			<th><a href="SignUp">Registrarse</a>
			<th width="200"></th>
		</tr>
	</table>
	<h1>Sign up</h1>
	<form action="SignUpController" method="post">
		Username : <input type="text" name="username"> <BR>
		Password : <input type="password" name="password"> <BR>
	<input	type="submit" value="Sign Up" />
	</form>


</body>
</html>