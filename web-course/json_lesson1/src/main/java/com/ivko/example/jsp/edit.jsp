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
    <script type="text/javascript">
        function validate()
        {
            var name_pattern= /^[a-z A-Z]+$/; //name pattern allowed alphabet a-z or A-Z
            var owner_pattern= /^[a-z A-Z]+$/; //owner pattern allowed alphabet a-z or A-Z
            var name = document.getElementById("name"); //get textbox id "name" and store in "name" variable
            var owner = document.getElementById("owner"); //get textbox id "owner" and store in "owner" variable

            if(!name_pattern.test(name.value) || name.value=='') //check if condition using test() method for matching name parameter pattern or not blank value
            {
                alert("Enter Name Alphabet Only....!"); //alert message
                name.focus();
                name.style.background = '#f08080'; //set textbox color
                return false;
            }
            if(!owner_pattern.test(owner.value) || owner.value=='') //check if condition using test() method for matching owner parameter pattern or not blank value
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
        <h1>Update Record</h1>
    </center>

    <form method="post" action="EditController" onsubmit="return validate();">
        <table>
            <%
                if(request.getParameter("edit_id")!=null) //get edit_id from index.jsp page with href link and check not null after continue
                {
                    int id=Integer.parseInt(request.getParameter("edit_id")); //get edit_id store in "id" variable
                    String url="jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
                    String username="root"; //database connection username
                    String password="root"; //database password
                    try
                    {
                        Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
                        Connection con=DriverManager.getConnection(url,username,password); //create connection
                        PreparedStatement pstmt; //create statement
                        pstmt=con.prepareStatement("select * from person where id=?"); //sql select query
                        pstmt.setInt(1,id);
                        ResultSet rs=pstmt.executeQuery(); //execute query and set in Resultset object rs.
                        while(rs.next())
                        {
            %>
            <tr>
                <td>Name</td>
                <td><input type="text" name="txt_name" id="name" value="<%=rs.getString("name")%>"></td>
            </tr>

            <tr>
                <td>Owner</td>
                <td><input type="text" name="txt_owner" id="owner" value="<%=rs.getString("owner")%>"></td>
            </tr>

            <tr>
                <td><input type="submit" name="btn_edit" value="Update"></td>
            </tr>
            <input type="hidden" name="hidden_id" value="<%=rs.getInt("id")%>">
            <%
                        }
                        pstmt.close(); //close statement
                        con.close(); //close connection
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            %>
        </table>

        <center>
            <h3 style="color:red;">
                <%
                    if(request.getAttribute("UpdateErrorMsg")!=null)
                    {
                        out.print(request.getAttribute("UpdateErrorMsg")); //get update record fail error message from EditController.java
                    }
                %>
            </h3>

            <h1><a href="index.jsp">Back</a></h1>
        </center>

    </form>

</div>

</body>
</html>

