<%@page contentType="text/plain" %> 

<%
	if (request.getParameter("username") != null){
	
		String uname = request.getParameter("username").toString();
		
		if (uname.equals("")){
			out.println("Please Fill this column");
		}
		else{
			out.println("valid");
		}
	}
%>