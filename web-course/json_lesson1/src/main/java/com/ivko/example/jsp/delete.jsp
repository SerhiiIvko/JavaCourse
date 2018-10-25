<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<%
    if(request.getParameter("delete_id")!=null) //get delete_id from index.jsp page with href link and check not null after continue
    {
        int id=Integer.parseInt(request.getParameter("delete_id")); //get delete_id store in "id" variable
        String url="jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
        String username="root"; //database connection username
        String password="root"; //database password
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
            Connection con=DriverManager.getConnection(url,username,password); //create connection
            PreparedStatement pstmt; //create statement
            pstmt=con.prepareStatement("delete from person where id=?"); //sql delete query
            pstmt.setInt(1,id);
            pstmt.executeUpdate(); //execute query
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp"); //after delete success forward index.jsp page
            rd.forward(request, response);
            pstmt.close(); //close statement
            con.close(); //close connection
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
%>