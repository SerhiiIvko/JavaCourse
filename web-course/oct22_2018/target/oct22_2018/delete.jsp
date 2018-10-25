<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>

<%
    if (request.getParameter("delete_id") != null) {
        int id = Integer.parseInt(request.getParameter("delete_id"));
        String url = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("delete from person where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>