<%@page contentType="text/html"%>

<!DOCTYPE html>
	<head>
		<title> Implement User Authentication </title>
	</head>
	
	<body>
	
	<% 
		if (session.getAttribute("name") == null){
			response.sendRedirect("T3Q3login.jsp");
		}
		else{
			out.println("Welcome "+(String)session.getAttribute("name"));
			out.println("<button><a href=\"UserValidator?logout=y\" > Logout </a></button>");
		}
		
	%>
	
	</body>
	
<html>