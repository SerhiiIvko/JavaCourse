<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
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
            let email = document.getElementById("owner");
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
        <h1>Update Record</h1>
    </center>
    <form method="post" action="EditController" onsubmit="return validate();">
        <table>
            <%
                if (request.getParameter("edit_id") != null) {
                    int id = Integer.parseInt(request.getParameter("edit_id"));
                    String url = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                    String username = "root";
                    String password = "root";
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(url, username, password);
                        PreparedStatement pstmt;
                        pstmt = con.prepareStatement("select * from person where id=?");
                        pstmt.setInt(1, id);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
            %>
            <tr>
                <td>Name</td>
                <td><input type="text" name="txt_name" id="name" value="<%=rs.getString("name")%>"></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><input type="text" name="txt_email" id="email" value="<%=rs.getString("email")%>"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="txt_password" id="password" value="<%=rs.getString("password")%>"></td>
            </tr>
            <tr>
                <td><input type="submit" name="btn_edit" value="Update"></td>
            </tr>
            <input type="hidden" name="hidden_id" value="<%=rs.getInt("id")%>">
            <%
                        }
                        pstmt.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            %>
        </table>
        <center>
            <h3 style="color:red;">
                <%
                    if (request.getAttribute("UpdateErrorMsg") != null) {
                        out.print(request.getAttribute("UpdateErrorMsg"));
                    }
                %>
            </h3>
            <h1><a href="index.jsp">Back to Index</a></h1>
        </center>
    </form>
</div>
</body>
</html>