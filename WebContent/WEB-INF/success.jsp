<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="1000" align="center">
		<tr bgcolor="skyblue">
			<th><a href="ListProducts?action=see">Productos</a></th>
			<th><a href="ListProducts?action=see">Carrito</a></th>
			<th><a href="ServletLogeo?accion=cerrar">Cerrar Secci�n</a></th>
			<th width="200"></th>
		</tr>
	</table>
	Welcome
	<%=session.getAttribute("username")%>
	<%=session.getAttribute("role")%>
	<p>
		<a href="LogIn">Log In</a>
	</p>
</body>
</html>