<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Attribute</title>
		<style type=text/css>
		body{
			background-color: #fdecba;
		}
		
		</style>
	</head>

	<body>
		<c:forEach var="product" items="${products}">
			<p>${product.id}:${product.name}:${product.price}</p>
		</c:forEach>
	</body>
</html>