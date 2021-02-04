<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout Produit</title>
</head>
<body>
	<h1>Ajout Produit</h1>
	<form action="addProduct" method="post">
		<label for="username">Product name : </label><br>
	    <input type="text" name="name" id="name" /><br>
	      <label for="description">Product description : </label><br>
	    <input type="text" name="description" id="description" /> <br>
	    <label for="price">Product price : </label><br><br>
	    <input type="number" name="price" id="price" /> <br><br>
	    <input type="submit" />
	</form>
</body>
</html>