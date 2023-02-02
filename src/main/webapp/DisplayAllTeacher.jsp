<%@page import="schoolmanagement.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Teacher</title>
</head>
<body>
<h1 align="center">Teacher Details</h1>
	<hr size="5">
	<%
	List<Teacher> a1 = (List) session.getAttribute("displayallteacher");
	%>
	<table align="center" cellpadding="20px" border="1">
		
		<th>id</th>
		<th>name</th>
		<th>subject</th>
		<th>salary</th>
		<%for(Teacher x:a1) { %>

<tr align="center">
<td><%=x.getId() %></td>
<td><%=x.getName() %></td>
<td><%=x.getSubject() %></td>
<td><%=x.getSalary() %></td>

</tr>
		<% } %>


	</table>
	<div align="center">
	    <hr>
		<a href="Teacher.html">Return to teacher option</a>
		
		</div>

</body>
</html>