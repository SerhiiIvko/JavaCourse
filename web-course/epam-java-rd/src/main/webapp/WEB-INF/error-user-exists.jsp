<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="../libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Error!</title>
</head>
<body>
<div class="row justify-content-md-center">
    <div class="col-md-auto">
        <h1 align="center">Error! User already exists!</h1>
        <h2 align="center">Return to welcome page</h2>
    </div>
</div>
<div class="row justify-content-md-center">
    <form class="col-6" action="/index.jsp" method="get">
        <p align="center">
            <button type="submit" class="btn btn-primary">To welcome Page</button>
        </p>
    </form>
</div>
<script type="text/javascript" src="../libs/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../libs/propper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="../libs/bootstrap-4.1.3/js/bootstrap.min.js"></script>
</body>
</html>