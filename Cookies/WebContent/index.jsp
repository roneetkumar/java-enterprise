<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="index.jsp">
		<select name="course">
			<option value="java">Java</option>
			<option value="php">PHP</option>
			<option value="go">Go</option>
			<option value="ruby">Ruby</option>
		</select>
	<input type="submit" value="Submit"/>
	
	</form>
	
	<%
		String lang = request.getParameter("course");
		Cookie  tempCookie = new Cookie("course","SpringFram-e");
		tempCookie.setMaxAge(60*60*24*365);
		response.addCookie(tempCookie);	
	%>
	
	Thanks for adding the ${param.course}

</body>
</html>