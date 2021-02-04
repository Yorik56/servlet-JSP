<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
        <%@ page import="fr.mds.productmanager.dao.ProductDao" %>
    <%@ page import="java.util.List" %>
    <%@ page import="fr.mds.productmanager.model.Product" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showProduct JSP</title>
</head>
<body>
<%@ include file = "header.jsp" %>
<table>

	<tr>
		<td><c:out value="${product.id }"></c:out></td>
		<td><c:out value="${product.name }"></c:out></td>
		<td><c:out value="${product.price }"></c:out></td>
		<td><c:out value="${product.description}"></c:out></td>
	</tr>

</table>
<%@ include file = "footer.jsp" %>
</body>
</html>