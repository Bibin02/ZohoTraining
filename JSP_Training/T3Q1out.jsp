<%@page contentType="text/html" %>
<%@page import="java.io.*"%>
<!DOCTYPE html>
	<head>
		<title> Fibonacci Sequence </title>
	</head>
	
	<body>
	<%!
		static void fib(int n, JspWriter out) throws IOException{
			int first = 0;
			int second = 1;
			int temp = first + second;
			
			while(n>0){
				out.println(first+"<br/>");
				temp = second + first;
				first = second;
				second = temp;
				n--;
			}
		}
	
	%>
	Fibonacci Sequence of Range -> 
	<%
		int n = Integer.parseInt(request.getParameter("a"));
		out.println(n+"<br/>");
		fib(n, out);
	%>
	
	</body>
	
<html>