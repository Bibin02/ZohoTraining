<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects Example</title>
</head>
<body>
    <h1>JSP Implicit Objects Example</h1>

    <!-- Using request implicit object -->
    <p><strong>Request URL:</strong> <%= request.getRequestURL() %></p>
    <p><strong>Request Method:</strong> <%= request.getMethod() %></p>

    <!-- Using response implicit object -->
    <p><strong>Response Content Type:</strong> <%= response.getContentType() %></p>

    <!-- Using out implicit object -->
    <p><strong>Current Date and Time:</strong> <%= new java.util.Date() %></p>

    <!-- Using session implicit object -->
    <%
        session.setAttribute("user", "UserName");
    %>
    <p><strong>Session User:</strong> <%= session.getAttribute("user") %></p>

    <!-- Using application implicit object -->
    <%
        application.setAttribute("appName", "JSP Implicit Objects Demo");
    %>
    <p><strong>Application Name:</strong> <%= application.getAttribute("appName") %></p>

    <!-- Using config implicit object -->
    <p><strong>Servlet Config:</strong> <%= config.getServletName() %></p>

    <!-- Using pageContext implicit object -->
    <p><strong>Page Context Info:</strong> <%= pageContext.getRequest() %></p>

    <!-- Using page implicit object -->
    <p><strong>Page Instance:</strong> <%= page %></p>

    <!-- Using exception implicit object (only available in error pages) -->
    <%-- Uncomment the following block to test in an error page --%>
    <%-- 
    <%
        if (exception != null) {
            out.println("<p><strong>Exception Message:</strong> " + exception.getMessage() + "</p>");
        }
    %>
    --%>
</body>
</html>
