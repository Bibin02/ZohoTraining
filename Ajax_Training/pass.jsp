<%@page contentType="text/plain" %> 

<%
	if (request.getParameter("password") != null){
		
		String pass = request.getParameter("password").toString();
		
		if (pass.equals("")){
			out.println("Please Fill this column");
		}
		else if(pass.length() < 8){
			out.println("Password Length Should be 8");
		}
		else{
			out.println("valid");
		}
	}
%>