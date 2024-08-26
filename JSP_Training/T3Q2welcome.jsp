<!DOCTYPE html>
<html lang="en">
<head>
    <style>

    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome User</title>
</head>
<body>
    <div id="wrapper">
        <%  
            Cookie usercookie = null;
            Cookie[] cookies = request.getCookies();

            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username") && (!cookie.getValue().equals(""))) {
                    usercookie = cookie;
                    break;
                }
            }

            if (request.getParameter("logout") != null){
                // Deleting cookie by setting age as negative and adding ie, rewriting it to cookies of the client.
                Cookie ck = new Cookie("username","");
                ck.setMaxAge(0);
                response.addCookie(ck);
                response.sendRedirect("T3Q2.jsp");
            }
            else if(usercookie != null){
                out.println("Welcome "+usercookie.getValue());
                out.println("<button><a href=\"T3Q2welcome.jsp?logout=yes\">Logout</a></button>");
            }
            else{
                out.println("Please Login.");
            }
        %>
    </div>
</body>
</html>