<!-- Implemented Directive isErrorPage -->
<%@page contentType="text/html" import="java.util.*"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
	<head>
		<title> Exception Handling </title>
	</head>
	
	<body>
	
	Exception Occured
	<%= exception.getMessage() %>
	
	</body>
	
<html>