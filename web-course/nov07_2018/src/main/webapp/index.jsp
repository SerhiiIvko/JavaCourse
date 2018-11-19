<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Get and set studentBean properties in Expression Language</title>
</head>
<body>
<jsp:useBean id="students" class="model.StudentBean">
    <jsp:setProperty name="students" property="name" value="Ивко"/>
    <jsp:setProperty name="students" property="secondName" value="Сергей"/>
    <jsp:setProperty name="students" property="surname" value="Александрович"/>
</jsp:useBean>
<p>Варианты вывода:</p>
<br>
<p>1) Вывод в коде страницы, используется конкатенация строковых параметров в одну строку.</p>
<h1>${students.name.concat(" ").concat(students.secondName).concat(" ").concat(students.surname)}</h1>
<p>2) Строка ФИО студента формируется с нужным тегом заголовка в java коде в методе toString()</p>
${students.toString()}
</body>
</html>