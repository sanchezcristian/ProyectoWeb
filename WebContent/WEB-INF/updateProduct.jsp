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
			<th><a href="ListProducts?action=add">Agregar Productos</a></th>
			<th><a href="ServletLogeo?accion=cerrar">Cerrar Sección</a></th>
			<th width="200"></th>
		</tr>
	</table>
	<br>
	<br>
	<form method="get" action="ListProducts?action=updateDB">
		<div>
			<input type="hidden" name="action" value="updateDB" />
			<table border="1">
			<c:forEach items="${product}" var="product">
				<tr>
					<td>Codigo</td>
					<td><input type="text" name="cod" value="${product.cod}" readonly/></td>
				</tr>
				<tr>
					<td>Nombre</td>
					<td><input type="text" name="name" value="${product.name}" /></td>
				</tr>
				<tr>
					<td>Descripción</td>
					<td><input type="text" name="description" value="${product.description}" /></td>
				</tr>
				<tr>
					<td>Precio</td>
					<td><input type="text" name="price" value="${product.price}" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Actualizar" /></td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</form>

</body>
</html>