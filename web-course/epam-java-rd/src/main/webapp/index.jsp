<!DOCTYPE html>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Главная страница</title>
</head>

<body>
<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-auto">
            <h1>Главная страница</h1>
        </div>
    </div>
    <c:choose>
        <c:when test="${empty sessionScope.user}">
            <div class="row">
                <div class="col-6">
                    <h3>Логин</h3>
                </div>
                <div class="col-6">
                    <h3>Регистрация</h3>
                </div>
            </div>
            <div class="row">
                <form class="col-6" action="/login" method="post">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email</label>
                        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Введите email">
                        <small id="emailHelp" class="form-text text-muted">Мы никому не будем передавать Ваш email</small>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Пароль</label>
                        <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Пароль">
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                </form>
                <form class="col-6" action="/register" method="post">
                    <div class="form-group">
                        <label for="registrationEmail">Email</label>
                        <input name="email" type="email" class="form-control" id="registrationEmail" aria-describedby="emailHelp" placeholder="Введите email">
                        <small id="registrationEmailHelp" class="form-text text-muted">Введите валидный email</small>
                    </div>
                    <div class="form-group">
                        <label for="registrationPassword">Пароль</label>
                        <input name="password" type="password" class="form-control" id="registrationPassword" placeholder="Пароль">
                    </div>
                    <div class="form-group">
                        <label for="registrationName">Имя</label>
                        <input name="name" type="text" class="form-control" id="registrationName" placeholder="Имя">
                    </div>
                    <div class="form-group">
                        <label for="registrationSurname">Фамилия</label>
                        <input name="surname" type="text" class="form-control" id="registrationSurname" placeholder="Фамилия">
                    </div>
                    <div class="form-group">
                        <label for="registrationAge">Возраст</label>
                        <input name="age" type="number" class="form-control" id="registrationAge" placeholder="Возраст">
                    </div>
                    <button type="submit" class="btn btn-primary">Регистрация</button>
                </form>
            </div>
        </c:when>
        <c:otherwise>
            <form class="col-6" action="/profile" method="get">
                <button type="submit" class="btn btn-primary">Посмотреть профиль пользователя</button>
            </form>
        </c:otherwise>
    </c:choose>
</div>

<script type="text/javascript" src="libs/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="libs/propper-1.11.0/popper.min.js"></script>
<script type="text/javascript" src="libs/bootstrap-4.1.3/js/bootstrap.min.js"></script>

</body>
</html>
