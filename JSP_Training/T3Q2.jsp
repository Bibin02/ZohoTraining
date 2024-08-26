<!DOCTYPE html>
<html lang="en">
<head>
    <style>

    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Authentication Using Cookies</title>
</head>
<body>
    <form action="AuthUserCookie" method="post">
        <label for="username">Enter Your name</label><br>
        <input type="text" name="username" required><br>

        <label for="password">Enter Your Password</label><br>
        <input type="password" name="password" required><br>

        <input type="submit" value="Login">
    </form>
    <button><a href="T3Q2signup.jsp">Signup</a></button>

    <div>
        <%
            out.println("Hello World");
            if (request.getAttribute("log") != null)
                out.println(request.getAttribute("log").toString());
        %>
    </div>
</body>
</html>