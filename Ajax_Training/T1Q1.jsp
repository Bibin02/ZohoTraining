<%@page contentType="text/plain" import="java.io.*" %> 

<%
    try{
		String path = getServletContext().getRealPath("/sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(path));
		
		String line = br.readLine();
		
		while (line != null){
			out.println(line+"<br/>");
			line = br.readLine();
		}
		
		br.close();
    }

    catch(IOException e){
        out.println(e.getMessage());
    }
%>