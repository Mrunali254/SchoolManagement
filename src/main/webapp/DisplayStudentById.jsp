<%@page import="schoolmanagement.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispaly Student By Id</title>
<style type="text/css">
a{
align :right;
color :black;
background-color: white;
text-decoration:none;
padding: 20 px;
}
div {
text- align: right;
}
</style>
</head>
<body>
<h1 align="center">Student details</h1>
<hr>
<%Student x=(Student)session.getAttribute("displaystudent"); %>

	<table align="center" cellpadding="20px" border="1">
	    
	    <th>id</th>
		<th>name</th>
		<th>stream</th>
		<th>fees</th>
		

<tr align="center">
<td><%=x.getName() %></td>
<td><%=x.getId() %></td>
<td><%=x.getStream() %></td>
<td><%=x.getFees() %></td>

</tr>
		

	</table>
	<div align="center">
	    <hr>
		<a href="Student.html">return to student option</a>
		<hr><a href="DisplayStudentById.html">display another student </a>
		</div>
	
</body>
</html>