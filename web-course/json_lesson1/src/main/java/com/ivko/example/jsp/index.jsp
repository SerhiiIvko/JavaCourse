<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Java MVC Add, Edit, Delete Using JSP & Servlet With MySQL</title>
    <link href="css/main.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="main">
    <center>
        <h1><a href="add.jsp">Add Record</a></h1>
    </center>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Owner</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <%
            String url="jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
            String username="root"; //database connection username
            String password="root"; //database password

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
                Connection con=DriverManager.getConnection(url,username,password); //create connection

                PreparedStatement pstmt; //create statement

                pstmt=con.prepareStatement("select * from person"); //sql select query
                ResultSet rs=pstmt.executeQuery(); //execute query and set in ResultSet object rs.

                while(rs.next())
                {
        %>
        <tr>
            <td><%=rs.getInt("id")%></td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("owner")%></td>
            <td><a href="edit.jsp?edit_id=<%=rs.getInt("id")%>">Edit</a></td>
            <td><a href="delete.jsp?delete_id=<%=rs.getInt("id")%>">Delete</a></td>

        </tr>
        <%
                }
                pstmt.close(); //close statement
                con.close(); //close connection
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        %>
    </table>

    <center>
        <h3 style="color:green;">
            <%
                if(request.getAttribute("InsertSuccessMsg")!=null)
                {
                    out.println(request.getAttribute("InsertSuccessMsg")); //get record insert success message from AddController.java
                }
            %>

            <%
                if(request.getAttribute("UpdateSuccessMsg")!=null)
                {
                    out.println(request.getAttribute("UpdateSuccessMsg")); //get record update success message from EditController.java
                }
            %>
        </h3>
    </center>
</div>
</body>
</html>