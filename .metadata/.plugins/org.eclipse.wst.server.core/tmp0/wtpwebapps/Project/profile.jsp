<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.project.models.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %>
<% 

User user = (User) session.getAttribute("user"); 

if(user == null){
	response.sendRedirect("index.jsp");
}
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Profile</title>
	<link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>

	<h1>Profile Page</h1>
	
	<tag:if test="${user != null}">
		<h3>${user.getFname()} ${user.getLname()} <br/></h3>
		<h3>${user.getEmail()} <br/></h3>
		<h3>${user.getPass()} <br/></h3>
	</tag:if>
	
	<nav> 
		<a href="Home">Home</a>
		<a href="Profile">Profile</a>
		<a href="index.jsp">Logout</a>
	</nav>
	<br/>
	
	<form action="CreatePost">
		<fieldset>
			<legend>Create Post</legend>
			<textarea name="postContent" placeholder="Write something"></textarea>
			<br/><br/>
			<input type="submit" value="create" />
			<input type="reset" value="clear" />
		</fieldset>
	</form>
	
	<tag:forEach var="post" items="${user.getPosts()}">
		<div class="post">
			<h4>${post.getContent()} <br></h4>
			<h4>${post.getEmail()} <br></h4>
			<h4>${post.getDate()} <br></h4>
			<h4>${post.getPostId()} <br></h4>
			
			<form action="PostOperations">
				<button name="delete" value="${post.getPostId()}">Delete</button>
				<button name="edit" name="delete"value="${post.getPostId()}">Edit</button>
				<button name="like" value="${post.getPostId()}"> ${post.getLikes()} Like </button>
			</form>
		</div>
	</tag:forEach>
	
</body>
</html>