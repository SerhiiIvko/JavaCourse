<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hit Count Servlet Visit Page</title>
</head>
<body>
<p>Number of visitors all pages = <%=request.getAttribute("counter")%>
</p>
<a href="index.jsp">home page</a>
</body>
</html>