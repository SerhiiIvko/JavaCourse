package com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(
        name = "RegisterUser",
        urlPatterns = "/register"
)
public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = -6780333887644654820L;

    public RegisterUser() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        Connection connection;
        String url = "jdbc:mysql://localhost:3306/people?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";
        response.setContentType("text/html");
        try {
            String name = request.getParameter("name");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "root");
            String returnMessage;
            try (PreparedStatement checkAccountExists = connection.prepareStatement("SELECT * FROM persons WHERE name = ?")) {
                checkAccountExists.setString(1, name);
                try (ResultSet resultSet = checkAccountExists.executeQuery()) {
                    if (resultSet.next()) {
                        returnMessage = "Failed to insert the data, this person is already exists in database!";
                        writer.println("<font size='6' color=blue>" + returnMessage + "</font>");
                    } else {
                        try (PreparedStatement insert = connection.prepareStatement("insert into persons(name) values(?)")) {
                            insert.setString(1, name);
                            returnMessage = "Record has been inserted";
                            writer.println("<font size='6' color=blue>" + returnMessage + "</font>" + "<br>");
                            insert.executeUpdate();
                            //output all table with all fields
                            PreparedStatement select = connection.prepareStatement("SELECT * FROM persons");
                            ResultSet set = select.executeQuery();
                            ResultSetMetaData metadata = set.getMetaData();
                            int columnCount = metadata.getColumnCount();
                            for (int i = 1; i <= columnCount; i++) {
                                writer.println("<font size='3' color=green>" + metadata.getColumnName(i) + " " + "</font>");
                            }
                            writer.println("<br>");
                            while (set.next()) {
                                StringBuilder row = new StringBuilder();
                                for (int i = 1; i <= columnCount; i++) {
                                    row.append(set.getString(i)).append(" ");
                                }
                                System.out.println();
                                writer.println("<font size='3' color=green>" + row + "</font>" + "<br>");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            writer.println(e);
        }
    }
}