<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" %>
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
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Categoria</th>
				<th>Precio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${product}" var="product">
				<tr>
					<td><c:out value="${product.name}" /></td>
					<td><c:out value="${product.description}" /></td>
					<td><c:out value="${product.price}" /></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>