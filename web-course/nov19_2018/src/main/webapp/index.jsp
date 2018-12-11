<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>
<html>
<head>
    <title>Session Tracking</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="lib/bootstrap-4.1.3/css/bootstrap.css">
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
<script type="text/javascript" src="lib/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="lib/popper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="lib/bootstrap-4.1.3/js/bootstrap.js"></script>
</body>
</html>