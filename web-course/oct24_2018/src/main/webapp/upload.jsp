<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>File Upload to Database</title>
</head>
<body>
<center>
    <h1>File Upload to Database</h1>
    <form name="fileform" method="post" action="FileUploadDBServlet" enctype="multipart/form-data">
        <label form="firstName">First name:</label>
        <input type="text" name="firstName" size="50" placeholder="Enter your first name" required/><br><br>
        <label form="lastName">Last name: </label>
        <input type="text" name="lastName" size="50" placeholder="Enter your last name" required/><br><br>
        <label form="photo">Portrait photo: </label>
        <input type="file" name="photo" size="40" required/><br><br>
        <input type="submit" value="Save">
    </form>
</center>
</body>
</html>