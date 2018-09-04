<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="libs/bootstrap-4.1.3/css/bootstrap.min.css">
    <title>Профиль юзера</title>
</head>
<body>
<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-auto">
            <h1>Профиль пользователя</h1>
        </div>
    </div>
    <div class="col-6">
        <c:if test="${not empty sessionScope.user}">
            <c:set var="user" value="${sessionScope.user}"/>
            <div class="row">
                <div class="col-6">
                    <h3>Имя:</h3>
                </div>
                <div class="col-6">
                    <h3>${user.name}</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-6">
                    <h3>Фамилия:</h3>
                </div>
                <div class="col-6">
                    <h3>${user.surname}</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-6">
                    <h3>Возраст:</h3>
                </div>
                <div class="col-6">
                    <h3>${user.age}</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-6">
                    <h3>Email:</h3>
                </div>
                <div class="col-6">
                    <h3>${user.email}</h3>
                </div>
            </div>
        </c:if>
    </div>
</div>
<%
    String site = "/index.jsp";
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>

</body>
</html>
