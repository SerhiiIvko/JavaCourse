<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome! Create robot h
        <h2 align="center">﻿Создать Проект Spring MVC <br> и реализовать минимальное взаимодействие
            Вида модели и контроллера</h2>
        <h3>Create robot</h3>
        <p>The time of creation this robot is ${tere!</title>
                </head>
                <body>ime}.</p>
        <form action="robot" method="post">
            <label>Input robot name:
                <input type="text" name="name">
            </label>
            <br>
            <br>
            <label>Input robot greeting message:
                <input type="text" name="greeting">
            </label>
            <br>
            <br>
            <input
                    type="submit" value="Create robot">
        </form>
        </body>
</html>