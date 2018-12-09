<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true" %>
<html>
<head>
    <title>Session Tracking</title>
</head>
<body>
<h1>Welcome to veggie-shop!</h1>
<form action="LoginServlet" method="POST">
    User:<br/><label>
    <input type="text" name="user"/>
</label><br/>
    Password:<br/><label>
    <input type="password" name="password"/>
</label><br/>
    <input type="submit" value="LoginServlet"/>
</form>
</body>
</html>