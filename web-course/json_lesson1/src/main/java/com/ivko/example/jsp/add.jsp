<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Java MVC Add, Edit, Delete Using JSP & Servlet With MySQL</title>
    <link href="css/main.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        function validate()
        {
            var name_pattern= /^[a-z A-Z]+$/; //name pattern allowed alphabet a-z or A-Z
            var owner_pattern= /^[a-z A-Z]+$/; //owner pattern allowed alphabet a-z or A-Z
            var name = document.getElementById("name"); //get textbox id "name" and store in "name" variable
            var owner = document.getElementById("owner"); //get textbox id "owner" and store in "owner" variable
            if(!name_pattern.test(name.value) || name.value=='') //check if condition using test() method for name matching parameter pattern or not blank value
            {
                alert("Enter Name Alphabet Only....!"); //alert message
                name.focus();
                name.style.background = '#f08080'; //set textbox color
                return false;
            }
            if(!owner_pattern.test(owner.value) || owner.value=='') //check if condition using test() method for owner matching parameter pattern or not blank value
            {
                alert("Enter Owner Alphabet Only....!"); //alert message
                owner.focus();
                owner.style.background = '#f08080'; //set textbox color
                return false;
            }
        }
    </script>
</head>
<body>
<div class="main">
    <center>
        <h1>Add Record</h1>
    </center>
    <form method="post" action="AddController" onsubmit="return validate();">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="txt_name" id="name"></td>
            </tr>
            <tr>
                <td>Owner</td>
                <td><input type="text" name="txt_owner" id="owner"></td>
            </tr>
            <tr>
                <td><input type="submit" name="btn_add" value="Add"></td>
            </tr>
        </table>
        <center>
            <h3 style="color:red;">
                <%
                    if(request.getAttribute("InsertErrorMsg")!=null)
                    {
                        out.println(request.getAttribute("InsertErrorMsg")); //get insert record fail error message from AddController.java
                    }
                %>
            </h3>
            <h1><a href="index.jsp">Back</a></h1>
        </center>
    </form>
</div>
</body>
</html>