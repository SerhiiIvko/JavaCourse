package com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(
        name = "RegisterUser",
        urlPatterns = "/register")
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
                            writer.println("<font size='6' color=blue>" + returnMessage + "</font>");
                            insert.executeUpdate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            writer.println(e);
        }
    }
}