<!-- Implemented Directive import and contentType -->
<%@page contentType="text/html" import="java.util.*"%>

<!DOCTYPE html>
	<head>
		<title> Implement Directives </title>
	</head>
	
	<body>
	
	<form action="T1Q4.jsp">
	<input type="submit" value="Print Today's Date">
	</form>
	
	<% 
		String submit = request.getParameter("submit");
		if(submit == null){
			Date dt = new Date();
			out.println(dt);
		}
	%>
	
	</body>
	
<html>