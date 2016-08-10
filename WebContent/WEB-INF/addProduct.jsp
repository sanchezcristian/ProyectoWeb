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
			<th><a href="index.jsp">Registrar Productos</a></th>
			<th><a href="index.jsp">Registrar Venta </a></th>
			<th><a href="index.jsp">Consultar ventas</a></th>
			<th><a href="index.jsp">Catálogo</a></th>
			<th><a href="ServletLogeo?accion=cerrar">Cerrar Sección</a></th>
			<th width="200"></th>
		</tr>
	</table>
	<br>
	<br>
	<form method="get" action="ListProducts?action=new">
		<div>
			<input type="hidden" name="action" value="new" />
			<table border="1">
				<tr>
					<td>Codigo</td>
					<td><input type="text" name="cod" value="" /></td>
				</tr>
				<tr>
					<td>Nombre</td>
					<td><input type="text" name="name" value="" /></td>
				</tr>
				<tr>
					<td>Descripción</td>
					<td><input type="text" name="description" value="" /></td>
				</tr>
				<tr>
					<td>Precio</td>
					<td><input type="text" name="price" value="0" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Agregar Producto" /></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>