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
<title>List Product Page</title>
</head>
<body>
<%@ include file = "header.jsp" %>
<br>

<table>
<c:forEach items="${products }" var="p">
	<tr>
		<td><c:out value="${p.id }"></c:out></td>
		<td><c:out value="${p.name }"></c:out></td>
		<td><c:out value="${p.price }"></c:out></td>
		<td><c:out value="${p.description}"></c:out></td>
	</tr>
</c:forEach>
</table>
<br>
<%@ include file = "footer.jsp" %>
</body>
</html>