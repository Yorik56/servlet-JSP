<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.mds.productmanager.dao.ProductDao" %>
    <%@ page import="java.util.List" %>
    <%@ page import="fr.mds.productmanager.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Product Page</title>
</head>
<body>
<%@ include file = "header.jsp" %>
<br>
<br>
<%


	List<Product> products = ProductDao.getAllProducts();

	
	for(Product p : products) {
		out.println("<p>");
		out.println(p.getId()+" -> "+p.getName()+" -> "+p.getPrice()+"€ ->"+p.getDescription());
		out.println("</p>");
	}

%>
<br>
<%@ include file = "footer.jsp" %>
</body>
</html>