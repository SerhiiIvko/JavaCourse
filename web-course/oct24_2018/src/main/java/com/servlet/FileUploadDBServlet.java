package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "FileUploadDBServlet",
        urlPatterns = "/FileUploadDBServlet")
@MultipartConfig(maxFileSize = 16177215)
public class FileUploadDBServlet extends HttpServlet {
    private static final long serialVersionUID = 2939252677984521715L;

    public Connection getConnection() {
        Connection connection;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String dbURL = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String dbUser = "root";
            String dbPass = "root";
            connection = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Failed to obtain database connection.", e);
        }
        return connection;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        InputStream inputStream = null;
        Part filePart = request.getPart("photo");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        String message = null;
        try (Connection connection = getConnection()) {
            String insertQuery = "INSERT INTO contacts (first_name, last_name, photo) values (?, ?, ?)";
            PreparedStatement saveStatement = connection.prepareStatement(insertQuery);
            saveStatement.setString(1, firstName);
            saveStatement.setString(2, lastName);
            if (inputStream != null) {
                saveStatement.setBlob(3, inputStream);
            }
            int row = saveStatement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        } catch (SQLException e) {
            message = "ERROR: " + e.getMessage();
            e.printStackTrace();
        } finally {
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/message.jsp").include(request, response);
        }
    }
}