<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add, Edit, Delete Using JSP & Servlet With MySQL</title>
    <link href="css/main.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        function validate() {
            let name_pattern = /^[a-z A-Z]+$/;
            let email_pattern = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            let name = document.getElementById("name");
            let email = document.getElementById("email");
            if (!name_pattern.test(name.value) || name.value === '') {
                alert("Enter Name Alphabet Only....!");
                name.focus();
                name.style.background = '#f08080';
                return false;
            }
            if (!email_pattern.test(email.value) || email.value === '') {
                alert("Enter Owner Alphabet Only....!");
                email.focus();
                email.style.background = '#f08080';
                return false;
            }
        }
    </script>
</head>
<body>
<div class="main">
    <center>
        <h1>Add user</h1>
    </center>
    <form method="post" action="AddController" onsubmit="return validate();">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="txt_name" id="name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="txt_email" id="email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="txt_password" id="password"></td>
            </tr>
            <tr>
                <td><input type="submit" name="btn_add" value="Add"></td>
            </tr>
        </table>
        <center>
            <h3 style="color:red;">
                <%
                    if (request.getAttribute("InsertErrorMsg") != null) {
                        out.println(request.getAttribute("InsertErrorMsg"));
                    }
                %>
            </h3>
            <h1><a href="index.jsp">Back to Index</a></h1>
        </center>
    </form>
</div>
</body>
</html>