package com.ivko.example.dao;

import com.ivko.example.bean.AddBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddDao {
    public String checkInsert(AddBean addPerson) {
        String name = addPerson.getName(); //get name through addPerson object and store in temporary variable "name"
        String owner = addPerson.getOwner(); //get owner through addPerson object and store in temporary variable "owner"
        String url = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
        String username = "root"; //database connection username
        String password = "root"; //database password
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver); //load driver
            Connection con = DriverManager.getConnection(url, username, password); //create connection
            PreparedStatement pstmt; //create statement
            pstmt = con.prepareStatement("insert into person(name,owner) values(?,?)"); //sql insert query
            pstmt.setString(1, name);
            pstmt.setString(2, owner);
            pstmt.executeUpdate(); //execute query
            pstmt.close(); //close statement
            con.close(); //close connection
            return "INSERT SUCCESS"; //if valid return "INSERT SUCCESS" string
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL INSERT"; //if invalid return "FAIL INSERT" string
    }
}