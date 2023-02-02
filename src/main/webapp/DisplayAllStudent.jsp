<%@page import="schoolmanagement.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all student</title>
</head>
<body>
<h1 align="center">Student  Details</h1>
	<hr size="5">
	<%
	List<Student> a1 = (List) session.getAttribute("displayallstudent");
	%>
	<table align="center" cellpadding="20px" border="1">
		
		<th>id</th>
		<th>name</th>
		<th>stream</th>
		<th>fees</th>
		<%for(Student x:a1) { %>

<tr align="center">
<td><%=x.getId() %></td>
<td><%=x.getName() %></td>
<td><%=x.getStream() %></td>
<td><%=x.getFees() %></td>

</tr>
		<% } %>


	</table>
	<div align="center">
	    <hr>
		<a href="Student.html">Return to student option</a>
		
		</div>

</body>
</html>