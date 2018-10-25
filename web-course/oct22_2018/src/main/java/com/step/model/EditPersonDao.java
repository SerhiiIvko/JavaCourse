package com.step.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EditPersonDao {
    private static final String UPDATE_QUERY = "update person set name=?, email=?, password=? where id=?";

    public String checkUpdate(EditPerson editPerson) {
        String name_up = editPerson.getName();
        String email_up = editPerson.getEmail();
        String password_up = editPerson.getPassword();
        int id = editPerson.getId();
        String dbUrl = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
        String dbUsername = "root";
        String dbPassword = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement(UPDATE_QUERY);
            int parameterCounter = 1;
            preparedStatement.setString(parameterCounter++, name_up);
            preparedStatement.setString(parameterCounter++, email_up);
            preparedStatement.setString(parameterCounter++, password_up);
            preparedStatement.setInt(parameterCounter, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return "UPDATE SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL UPDATE";
    }
}