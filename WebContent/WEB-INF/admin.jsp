<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="1000" align="center">
		<tr bgcolor="skyblue">
			<th><a href="ListProducts?action=see">Productos</a></th>
			<th><a href="ListProducts?action=add">Agregar Productos</a></th>
			<th><a href="ServletLogeo?accion=cerrar">Cerrar Sección</a></th>
			<th width="200"></th>
		</tr>
	</table>
	<h2 align="center">Welcome <%= session.getAttribute( "role" ) %></h2>

</body>
</html>