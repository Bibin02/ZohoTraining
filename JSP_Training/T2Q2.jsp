<%@page contentType="text/html" import="java.util.*"%>

<!DOCTYPE html>
	<head>
		<title> Pattern </title>
	</head>
	
	<body>
	<form action="T2Q2.jsp">
		<label for="n" >Enter Number of Lines Value.
			<input name="n" type="text" placeholder="Rows">
		</label>
	
	<% 
		out.println("<br/>");
		
		if(request.getParameter("n") != null){
			int n = Integer.parseInt(request.getParameter("n"));
			
			int k = 1;
			for (int i=(2*n)-1; i>0; i--){
				for (int j=i; j>0; j--){
					out.print(k);
				}
				if (i<=n){
					k--;
				}
				else{
					k++;
				}
				
				out.println("<br/>");
			}
		}
	%>
	
	</body>
	
<html>