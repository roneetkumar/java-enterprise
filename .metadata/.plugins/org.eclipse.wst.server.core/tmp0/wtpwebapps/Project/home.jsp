<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %> 
<%@ page import="com.project.models.*" %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>
	<% User user = (User) session.getAttribute("user"); %>

	
	 <h1>Home Page</h1>
	 
	<%--
	<h3>${user.getFname()} <br/></h3>
	<h3>${user.getLname()} <br/></h3>
	<h3>${user.getEmail()} <br/></h3>
	<h3>${user.getPass()} <br/></h3> --%>
	
	<nav> 
		<a href="Home">Home</a>
		<a href="Profile">Profile</a>
		<a href="index.jsp">Logout</a>
	</nav>
	
	<br/>
	
	<tag:forEach var="post" items="${allPosts}">
		<div class="post">
			<h4>${post.getContent()} <br></h4>
			<h4>${post.getEmail()} <br></h4>
			<h4>${post.getDate()} <br></h4>
			<h4>${post.getPostId()} <br></h4>
		</div>
	
	
	</tag:forEach>
	
	
	

</body>
</html>