<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AddStudents">
		<input type="text" name="name" placeholder="name"/><br/><br/>
		<input type="text" name="age" placeholder="age"/><br/><br/>
		<input type="text" name="email" placeholder="email" /><br/><br/>
		<input type="text" name="cname" placeholder="course-name"/><br/><br/>
		<input type="text" name="cid" placeholder="course-id"/><br/><br/>
		<input type="submit"/><br/><br/>
	</form>
	
	<a href="checkStudent.jsp"> Check Student</a>

</body>
</html>