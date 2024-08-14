<%@page contentType="text/html" import="java.util.*"%>

<!DOCTYPE html>
	<head>
		<title> Pattern </title>
	</head>
	
	<body>
	Enter Number of Lines Value in Command line.
	
	<% 
		out.println("<br/>");
		int n = 5;
		
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
		
	%>
	
	</body>
	
<html>