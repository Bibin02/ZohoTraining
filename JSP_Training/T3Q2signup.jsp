<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        *{
            margin : 1em;
        }
        label{
            text-decoration: solid;
            text-transform: capitalize;
        }
        input{
            background-color: rgba(44, 2, 255, 0.3);
            font-size: medium;
            text-decoration: solid;
        }
        input[type="submit"]{
            background-color: antiquewhite;
            font-size: 1.2em;
        }
        input[type="submit"]:hover{
            background-color: aquamarine;
            cursor: pointer;
        }
        button{
            background-color: antiquewhite;
            font-size: 1.2em;
        }
        button:hover{
            background-color: aquamarine;
        }
        a{
            text-decoration: none;
            color: black;
        }
        #logmsg{
            border-radius: 5px;
            border: 2px dotted red;
            padding: 1em;
            width: fit-content;
        }
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
    <div id="logmsg">
        <%
            out.println("Log Message : ");
            if (request.getAttribute("log") != null)
                out.println(request.getAttribute("log").toString());
        %>
    </div>
</body>
</html>