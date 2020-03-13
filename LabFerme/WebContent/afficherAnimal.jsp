<%@page import="entities.AnimalType"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Liste Animal</h1>
	<table border="1">
	<tr>
		<th>Animal Id</th>
		<th>Animal Nom</th>
		<th>Animal Prix</th>
		<th>Animal Espece</th>
	</tr>
		<c:forEach var="animal" items="${listeAnimals}">
			<tr>
				<td>${animal.id}</td>
				<td>${animal.nom}</td>
				<td>${animal.prix}</td>
				<td>${animal.type}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="afficherFerme" >Afficher les fermes</a>
</body>
</html>