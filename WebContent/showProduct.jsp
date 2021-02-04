<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
        <%@ page import="fr.mds.productmanager.dao.ProductDao" %>
    <%@ page import="java.util.List" %>
    <%@ page import="fr.mds.productmanager.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showProduct JSP</title>
</head>
<body>

<%


String idStr = request.getParameter("id");

if(idStr == null) {
	out.println("missing id parameter");
	return;			
}

Long idLong = null;

try {
	idLong = Long.parseLong(idStr);			
} catch(NumberFormatException  e) {
	out.println("Parameter 'id' is not a long");
	return;
}

System.out.println("New parameter is :" + idLong );
Product product = ProductDao.findProduct(idLong);
out.println("Product: " + product.getId());

%>

</body>
</html>