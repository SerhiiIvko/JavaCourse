<!DOCTYPE html>
<%@ page errorPage="WEB-INF/error-invalid-data.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Register page</title>
</head>

<body>
<div class="row justify-content-md-center">
    <div class="container">
        <div class="row justify-content-md-center">
            <div class="col-md-auto">
                <h1>Register page</h1>
            </div>
        </div>
        <c:choose>
            <c:when test="${empty sessionScope.user}">
                <div class="row">
                    <form class="col-6" action="/register" method="post">
                        <div class="form-group">
                            <label for="registrationEmail">Email</label>
                            <input name="email" type="email" class="form-control" id="registrationEmail"
                                   aria-describedby="emailHelp" placeholder="Email">
                            <small id="registrationEmailHelp" class="form-text text-muted">Input correct email</small>
                        </div>
                        <div class="form-group">
                            <label for="registrationPassword">Password</label>
                            <input name="password" type="password" class="form-control" id="registrationPassword"
                                   placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label for="registrationName">Name</label>
                            <input name="name" type="text" class="form-control" id="registrationName"
                                   placeholder="Name">
                        </div>
                        <div class="form-group">
                            <label for="registrationSurname">Surname</label>
                            <input name="surname" type="text" class="form-control" id="registrationSurname"
                                   placeholder="Surname">
                        </div>
                        <div class="form-group">
                            <label for="registrationAge">Age</label>
                            <input name="age" type="number" class="form-control" id="registrationAge" placeholder="Age">
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form>
                </div>
            </c:when>
            <c:otherwise>
                <form class="col-6" action="/index.jsp" method="get">
                    <button type="submit" class="btn btn-primary">Return to welcomePage</button>
                </form>
            </c:otherwise>
        </c:choose>
    </div>
</div>
<script type="text/javascript" src="libs/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="libs/propper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="libs/bootstrap-4.1.3/js/bootstrap.min.js"></script>
</body>
</html>