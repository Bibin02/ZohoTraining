<%@page contentType="text/html"%>

<!DOCTYPE html>
	<head>
		<title> Implement User Authentication </title>
	</head>
	
	<body>
	
	<form action="UserValidator" method="post">
		The User Validation is maintained and Stored in a session for 30 mins.<br/>
		To remove the session we need mannual expiry those sessions or Undeployment of JSP project in Tomcat Manager. <br/><br/>
		Enter Your name for the Session : <input type="text" name="name"><br/>
		Enter Your Password : <input type="text" name="pass"><br/>
		<input type="submit" value="Login">
	</form>
	
	<% 
		String uname = (String)session.getAttribute("name");
		
		if (uname != null){
			session.setAttribute("name", uname);
			response.sendRedirect("T3Q3welcome.jsp");
		}
		
	%>
	
	</body>
	
<html>