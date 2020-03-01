<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="#">
	Add new item : <input type="text" placeholder="enter texts" name="todo"/>
		<input type="submit"/>
	</form>
	
	Item entered : <%= request.getParameter("todo") %>
	
	<%
		List<String> items = (List<String>) session.getAttribute("myList");
	
	/* 	if there is no list in session */ 
		if(items == null){
			items = new ArrayList<String>();
			session.setAttribute("myList", items);
		}
		
		String theItem = request.getParameter("todo");
		
		if(theItem != null){
			items.add(theItem);
		}
	%>
	
	<ol>
		<%
			for(String item: items){
				out.println("<li>" + item  + "</li>");
			}	
		%>
	
	</ol>
</body>
</html>