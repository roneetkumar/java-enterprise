<%@page import="entities.Fermier"%>
<%@page import="entities.Ferme"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
ArrayList<Ferme> fermes = (ArrayList<Ferme>) request.getAttribute("listFermes");
ArrayList<String> pays = (ArrayList<String>) request.getAttribute("listPays");
ArrayList<Fermier> fermiers = (ArrayList<Fermier>) request.getAttribute("listFermiers");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
form{
display: inline-block;
border: 4px double blue;
}

</style>
</head>
<body>
<h1>Filtre Ferme</h1> 
<form method="post" action="afficherFerme">
<h2>Filtre par pays </h2>
	<select name="pays">
		<%
			for(String s : pays){%>
				<option ><%=s%></option>
			<%}
		%>
	</select>	
	<input type="submit" value="Afficher" />
</form>

<form method="post" action="afficherFerme">
<h2>Filtre par fermier </h2>
	<select name="fermier">
		<%
			for(Fermier f : fermiers){%>
				<option value="<%=f.getId()%>" ><%=f.getNom()%></option>
			<%}
		%>
	</select>	
	<input type="submit" value="Afficher" />
</form>
<h1>Liste des Fermes</h1>
<table border="1">
<tr>
	<th>Nom Ferme</th>
	<th>Pays</th>
	<th>Nom Fermier</th>
	<th>Liste Animaux</th>
	
</tr>
<%
	for(Ferme f : fermes){%>
		<tr>
			<td><%=f.getNom()%></td>
			<td><%=f.getPays()%></td>
			<td><%=f.getFermierNom()%></td>
			<td><a href="afficherAnimals?ferme=<%=f.getId()%>" >Afficher animaux</a></td>				
		</tr>
	<%}
%>


</table>

</body>
</html>