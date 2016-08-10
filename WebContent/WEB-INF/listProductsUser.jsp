<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
			<th><a href="ListProducts">Productos</a></th>
			<th><a href="LogIn">Loguearse </a></th>
			<th><a href="SignUp">Registrarse</a>
			<th width="200"></th>
		</tr>
	</table>
	<h2 align="center">Productos</h2>
	<table border="1">
		<thead>
			<tr bgcolor="skyblue">
				<th>Producto Codigo</th>
				<th>Nombre</th>
				<th>Descripcion</th>
				<th>Precio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${product}" var="product">
				<tr>
					<td><c:out value="${product.cod}" /></td>
					<td><c:out value="${product.name}" /></td>
					<td><c:out value="${product.description}" /></td>
					<td><c:out value="${product.price}" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>


</body>
</html>