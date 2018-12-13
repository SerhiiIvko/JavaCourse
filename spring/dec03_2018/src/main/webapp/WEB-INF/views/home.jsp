<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<body>
<h2>﻿Создать Проект Spring MVC и реализовать минимальное взаимодействие
    Вида модели и контроллера</h2>

<form action="robot" method="post">
    <label>
        <input type="text" name="name">
    </label><br>
    <label>
        <input type="text" name="greeting">
    </label><br> <input
        type="submit" value="Create robot">
</form>
</body>
</html>
