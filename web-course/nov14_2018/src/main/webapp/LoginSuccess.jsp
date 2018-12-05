<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Login Success Page</title>
</head>
<body>
<%
    String message = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("message")) {
                message = cookie.getValue();
            }
        }
    }
%>
<h3>Welcome, </h3>
<%
    if (message != null) {
        out.println(message);
    } else {
        response.sendRedirect("/index.jsp");
    }
%>
<br><br>
</body>
</html>