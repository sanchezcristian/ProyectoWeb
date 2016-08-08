<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comunidadIT.service.ProductService"%>
<%@ page import="comunidadIT.model.Product"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<th>Nombre</th>
		<th>Marca</th>
		<th>Precio</th>
		<%
			ProductService ps = new ProductService();
			List<Product> lista = new ArrayList<>();
			lista = ps.getProductos();

			for (int i = 0; i < lista.size(); i++) {
				out.println("<tr>");
				out.println("<td>" + lista.get(i).getName() + "</td>");
				out.println("<td>" + lista.get(i).getDescription() + "</td>");
				out.println("<td>" + lista.get(i).getPrice() + "</td>");
				out.println("</tr>");
			}
		%>
		<c:forEach items="${product}" var="current">
			<tr>
				<td><c:out value="${current.name}" />
				<td>
				<td><c:out value="${current.description}" />
				<td>
				<td><c:out value="${current.price}" />
				<td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>