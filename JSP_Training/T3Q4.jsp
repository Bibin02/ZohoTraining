<%@ taglib prefix="validator" uri="/WEB-INF/password_validator.tld" %>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Password Validation</title>
</head>
<body>
    <h2>Password Validation</h2>

    <form action="validatePasswordServlet" method="post">
        <label for="password">Enter Password:</label>
        <input type="password" id="password" name="password" required>
        <input type="submit" value="Validate">
		
		<%!
			private static boolean validatePassword(String password) {
				if (password == null || password.length() < 8) {
					return false;
				}
				boolean hasDigit = false;
				boolean hasUpperCase = false;
				boolean hasLowerCase = false;

				for (char c : password.toCharArray()) {
					if (Character.isDigit(c)) hasDigit = true;
					if (Character.isUpperCase(c)) hasUpperCase = true;
					if (Character.isLowerCase(c)) hasLowerCase = true;
				}

				return hasDigit && hasUpperCase && hasLowerCase;
			}
		%>
		
		<%
			String password = (String) request.getAttribute("password");
			
			if (validatePassword(password)){
				out.println("Valid Password");
			}
			else{
				out.println("Invalid Password");
			}
		%>
		
		

    </form>
</body>
</html>
