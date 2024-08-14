<!-- Directives -->
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
	<head>
		<title> Zoho Corp.in </title>
	</head>
	
	<body>
	
	<!-- Declarative -->
	<%! 
		String message_str = "Zoho Corporation";
	%>
	
	<!-- Scriptlet -->
	<% 
		out.println("Hello");
	%>
	
	<!-- Expression -->
	<%= message_str %>
	
	</body>
	
<html>