<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project</title>
</head>
<body>
	<form action="Register" method="post">
		<fieldset>
			<legend>Register</legend>
			<input type="text" name="fname" placeholder="First Name" /><br><br>
			<input type="text" name="lname" placeholder="Last Name"/><br><br>
			<input type="email" name="email" placeholder="Email"/><br><br>
			<input type="password" name="pass" placeholder="Password"><br><br>
			<input type="submit"/>
			<input type="reset"/>
			<tag:if test="${registerError}"><span>error while creating account</span></tag:if>
		</fieldset>
	</form>
	
	<form action="Login" method="post">
		<fieldset>
			<legend>Login</legend>
			<input type="email" name="email" placeholder="Email" required/><br><br>
			<input type="password" name="pass" placeholder="Password" required><br><br>
			<input type="submit"/>
			<input type="reset"/>
			<tag:if test="${loginError}"><span>email or password wrong</span></tag:if>
		</fieldset>
	</form>
</body>
</html>