<%@page import="schoolmanagement.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispaly Teacher By Id</title>
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
<h1 align="center">Teacher Details</h1>
<hr>
<%Teacher x=(Teacher)session.getAttribute("displayteacher"); %>

	<table align="center" cellpadding="20px" border="1">
	    
	    <th>id</th>
		<th>name</th>
		<th>subject</th>
		<th>salary</th>
		

<tr align="center">
<td><%=x.getId() %></td>
<td><%=x.getName() %></td>
<td><%=x.getSubject() %></td>
<td><%=x.getSalary() %></td>

</tr>
		

	</table>
	<div align="center">
	    <hr>
		<a href="Teacher.html">return to teacher option</a>
		<hr><a href="DisplayTeacherById.html">display teacher student </a>
		</div>
	
</body>
</html>