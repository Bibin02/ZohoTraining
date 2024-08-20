<%@page contentType="text/plain" %> 

<%
    try{
        String pass = request.getParameter("password").toString();
        
        if (pass.equals("")){
            out.println("Please Enter the password");
        }
        else if(pass.length() < 8){
            out.println("Password length should be Minimum 8 characters");
        }
        else{
            out.println("Valid Password");
        }
    }
    catch(Exception e){
        out.println("Exception occured");
    }
%>