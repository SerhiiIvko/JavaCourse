<!DOCTYPE html>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="tag" uri="WEB-INF/custom.tld" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Welcome</title>
</head>
<body>
<h1 align="center">WELCOME!</h1>
<p align="center"><tag:User></tag:User></p>
<br>
<div class="row justify-content-md-center">
    <form class="col-6" action="register.jsp" method="get">
        <p align="center">
            <button type="submit" class="btn btn-primary">Register</button>
        </p>
    </form>
</div>
<script type="text/javascript" src="libs/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="libs/propper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="libs/bootstrap-4.1.3/js/bootstrap.min.js"></script>
</body>
</html>