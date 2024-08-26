<!DOCTYPE html>
<html lang="en">
<head>
    <style>

    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup New User</title>
</head>
<body>
    <form action="UpdateUserDB" method="post">
        <label for="username"> Enter Your Name:
            <input type="text" name="username" required>
        </label><br>
        <label for="password"> Enter Password
            <input type="text" name="password" required>
        </label><br>

        <input type="submit" value="Signup">
    </form>
    <button><a href="T3Q2.jsp">Login</a></button>
    <div id="log">
        <%
            if (request.getAttribute("log") != null)
                out.println(request.getAttribute("log").toString());
        %>
    </div>
</body>
</html>