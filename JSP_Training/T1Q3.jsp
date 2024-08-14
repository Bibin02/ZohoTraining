<!-- Directive for Exception handling -->
<%@page contentType="text/html" errorPage="error.jsp" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
	<head>
		<title> Zoho Corp.in </title>
	</head>
	
	<body>
	Division of 2 Numbers</br>
	<form action="T1Q3.jsp">
		Enter value A : <input type="text" name="a">
		Enter value B : <input type="text" name="b">
		<input type="submit">
	</form>
	
	<% 
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		int c = a/b;
		out.println(c);
		
		// We can use try catch also but errorPage directive is Standard.
		
		try{
			c = a/b;
		}
		catch(Exception e){
			out.println(c);
		}
		
		
	%>
	
	</body>
	
<html>