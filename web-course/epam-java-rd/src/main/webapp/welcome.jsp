<!DOCTYPE html>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Welcome</title>
</head>
<body>
<div class="row justify-content-md-center">
    <div class="col-md-auto">
        <h1>WELCOME!</h1>
    </div>
</div>
<br>
<div class="container">
    <form class="col-6" action="/register.jsp" method="get">
        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
<script type="text/javascript" src="libs/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="libs/propper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="libs/bootstrap-4.1.3/js/bootstrap.min.js"></script>
</body>
</html>