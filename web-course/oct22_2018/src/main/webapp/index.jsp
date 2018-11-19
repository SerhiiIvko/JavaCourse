<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add, Edit, Delete Using JSP & Servlet With MySQL</title>
    <link href="css/main.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="main">
    <center>
        <h1><a href="add.jsp">Add user</a></h1>
    </center>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <%
            String url = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
            String username = "root";
            String password = "root";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt;
                pstmt = con.prepareStatement("select * from person");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getInt("id")%>
            </td>
            <td><%=rs.getString("name")%>
            </td>
            <td><%=rs.getString("email")%>
            </td>
            <td><%=rs.getString("password")%>
            </td>
            <td><a href="edit.jsp?edit_id=<%=rs.getInt("id")%>">Edit</a></td>
            <td><a href="delete.jsp?delete_id=<%=rs.getInt("id")%>">Delete</a></td>
        </tr>
        <%
                }
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>
    <center>
        <h3 style="color:green;">
            <%
                if (request.getAttribute("InsertSuccessMsg") != null) {
                    out.println(request.getAttribute("InsertSuccessMsg"));
                }
            %>
            <%
                if (request.getAttribute("UpdateSuccessMsg") != null) {
                    out.println(request.getAttribute("UpdateSuccessMsg"));
                }
            %>
        </h3>
    </center>
</div>
</body>
</html>