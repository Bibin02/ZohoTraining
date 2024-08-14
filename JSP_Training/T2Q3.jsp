<%@page contentType="text/html"%>

<!DOCTYPE html>

	<head>
		<title>Software Developer Enrollment Form</title>
		<style>		
			body{
				color : black;
				text-align: left;
				margin : 5em 10em 10em 10em;
				font-size : 20px;
			}

			h1{
				color : grey;
				border-bottom : 1px solid red;
			}

			table{
				font-family : arial;
				text-align : left;
			}

			td{
				height : 4em;
				width : 25em;
			}

			label{
				font-family : arial;
				font-size : 20px;
			}

			.small_input{
				height : 2em;
				width : 20em;
				border : 1px solid grey;
				border-radius : 5px;
			}

			.button_input{
				height : 4em;
				width : 7em;
				margin : 1em 1em 1em 3em;
				border-color : red;
				background-color : white;
			}

			.important{
				display : inline;
				color : red;
			}

			.selections{
				width : 15em;
				height : 2em;
				font-size : 15px;
				text-align : center;
				border-radius : 5px;
			}

			.choice_button_input{
				height : 1.5em;
				width : 1.5em;
				color : red;
			}
		</style>
	</head>

	<body>
		<h1> Zoho Software Developer Registeration Form </h1>
		
		<%
			String name =  (String)request.getAttribute("name");
			String phone = (String)request.getAttribute("phone");
			String mail =  (String)request.getAttribute("mail");
			String gender =(String)request.getAttribute("gender");
			String age =   (String)request.getAttribute("age");
			String deg =   (String)request.getAttribute("deg");
			String clg =   (String)request.getAttribute("clg");
			String exp =   (String)request.getAttribute("exp");
			String skills =(String)request.getAttribute("skills");
		%>

		<form action="index.html">
			<table class="table_class">
				<tr>
					<td><label for="name"> Candidate Name </label> <div class="important">*<div> </td>
					<td><%=name %></td>
				</tr>

				<tr>
					<td><label for="phone"> Contact Number </label> <div class="important">*<div> </td>
					<td><%=phone %></td>
				</tr>
				
				<tr>
					<td><label for="mail"> Contact Email </label> <div class="important">*<div> </td>
					<td><%=mail %></td>
				</tr>

				<tr>
				<td ><label for="gender"> Gender </label> <div class="important">*<div> </td> <!-- Radio -->
				<td>
				<%=gender %></td>
				</tr>
				
				<tr>
				<td><label for="age"> Age </label> </td>
				<td><%=age %></td>
				</tr>
				
				<tr>
				<td><label for="deg"> Graduation Degree </label> <div class="important">*<div> </td> <!-- DropDown -->
				<td><%=deg %></td>
				</tr>
				
				<tr>
				<td><label for="clg"> College Name </label> <div class="important">*<div> </td>
				<td><%=clg %></td>
				</tr>
				
				<tr>
				<td><label for="exp"> Years of Experience </label> <div class="important">*<div> </td>
				<td><%=exp %></td>
				</tr>
				
				<tr>
				<td><label for="skills"> Skills Known </label> <div class="important">*<div> </td>
				<td>
				<%=skills %>
				</td>
				</tr>
				
				<tr>
				<td><button class="button_input" type="submit" > Return Home </button></td>
				</tr>
			</table>
		</form>
	</body>

</html>