<!DOCTYPE html>

	<head>
		<title>Education Details</title>
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

			.button_input{
				height : 4em;
				width : 7em;
				margin : 1em 1em 1em 3em;
				border-color : red;
				background-color : white;
			}
		</style>
	</head>

	<body>
		<h1> Education Details </h1>

			<table class="table_class">
				<tr>
					<td><label for="name"> Name </label>  </td>
					<td><% out.println(request.getParameter("name").toString()); %></td>
				</tr>

				<tr>
					<td><label for="phone"> Contact Number </label>  </td>
					<td><% out.println(request.getParameter("phone").toString()); %></td>
				</tr>
				
				<tr>
				<td><label for="clg"> College Name </label> </td>
				<td><% out.println(request.getParameter("clg").toString()); %></td>
				</tr>

				<tr>
				<td><label for="oq"> Other Educational Qualifications </label></td>
				<td><% out.println(request.getParameter("oq").toString()); %></td>
				</tr>
				
				<tr>
				<td><a href="index.html"><button class="button_input"> Return Home </button></a></td>
				</tr>
			</table>
	</body>

</html>