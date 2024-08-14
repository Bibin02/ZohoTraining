<%@page contentType="text/html" import="java.util.*" import="pagination.*"%>

<!DOCTYPE html>
	<head>
		<title> Implement Pagination </title>
	</head>
	
	<body>
	Student Due Table Page Number :
	<%=request.getParameter("pgno").toString() %>
	
		<table border="1">
			<tr><td>reg_no</td> <td>stu_name</td> <td>paid_amount</td> <td>due_amount</td> <td>due_date</td></tr>
			<% 
				if (request.getAttribute("students") != null){
					List<Student> stu_list = (List<Student>)request.getAttribute("students");
				
					for (Student stu : stu_list){
						out.println("<tr>");
						out.println("<td>"+stu.reg_no+"</td> <td>"+stu.stu_name+"</td> <td>"+stu.paid_amount+"</td> <td>"+stu.due_amount+"</td> <td>"+stu.due_date+"</td>");
						out.println("</tr>");
					}
				}
				
			%>
		</table>
		
		<a href="t2q4_control?pgno=1"> Page 1 </a>
		<a href="t2q4_control?pgno=2"> Page 2 </a>
		<a href="t2q4_control?pgno=3"> Page 3 </a>
	
	</body>
	
<html>