<%@page contentType="text/plain"%> 

<%	
    try {
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));
        out.println(a+b);
    }
    catch(Exception e){
        out.println("Please Enter 2 Integer values");
    }
    
%>