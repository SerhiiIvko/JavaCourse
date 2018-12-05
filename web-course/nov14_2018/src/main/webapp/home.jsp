<%@ page import="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
    //    Cookie[] cookies = request.getCookies();
    out.println(request.getParameter("user"));
%>
<h3>You had successfully logged in.</h3>
<br> your session is set to expire in 10min
<br> try reloading after 10 min
<h1>
</h1>
</body>
</html>