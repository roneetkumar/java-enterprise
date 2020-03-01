<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
	<form action="FindStudents">
		<select name="course">
			<option value="java"> java </option>
			<option value="c++"> c++ </option>
			<option value="python"> python </option>
			<option value="ruby"> ruby </option>	
		</select>
		<input type="submit" value="Check"/>
	</form>
	
	<h1>Found Students:</h1>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
		</tr>	
		
		
		<tag:forEach var="stu" items="${foundStu}">
			<tr>
				<td>
					${stu.getName()} <br/>
				</td>	
				<td>
					${stu.getAge()} <br/>
				</td>	
				<td>
					${stu.getEmail()} <br/>
				</td>	
			</tr>
		</tag:forEach>	
	
	
	</table>
	
</body>
</html>