<%@page contentType="text/plain" %> 

<%
	if (request.getParameter("password") != null && request.getParameter("c_password") != null){
		String pass = request.getParameter("password").toString();
		String cpass = request.getParameter("c_password").toString();
		
		if (pass.equals(cpass)){
			out.println("valid");
		}
		else{
			out.println("Password and Confirm Password Mismatch");
		}
	}
%>