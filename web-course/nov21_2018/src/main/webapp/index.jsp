<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hit Count Servlet Index Page</title>
</head>
<body>
<p>Number of visitors all pages = <%=request.getAttribute("counter")%>
</p>
<a href="visit.jsp">visit page</a>
</body>
</html>