package com.step.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddPersonDao {
    private final static String INSERT_QUERY = "insert into person(name, email, password) values(?, ?, ?)";

    public String checkInsert(AddPerson addPerson) {
        String name = addPerson.getName();
        String email = addPerson.getEmail();
        String password = addPerson.getPassword();
        String dbUrl = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername = "root";
        String dbPassword = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return "INSERT SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL INSERT";
    }
}