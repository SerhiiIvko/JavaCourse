package com.ivko.example.dao;

import com.ivko.example.bean.EditBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EditDao {
    public String checkUpdate(EditBean editBean) {
        String name_up = editBean.getName_UP();
        String owner_up = editBean.getOwner_UP(); //get all value through editBean object and store in temporary variable
        int hidden_id = editBean.getHidden_ID();
        String url = "jdbc:mysql://localhost:3306/db_mvcoperation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //database connection url string
        String username = "root"; //database connection username
        String password = "root"; //database password
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver); //load driver
            Connection con = DriverManager.getConnection(url, username, password); //create connection
            PreparedStatement pstmt; //create statement
            pstmt = con.prepareStatement("update person set name=?,owner=? where id=? "); //sql update query
            pstmt.setString(1, name_up);
            pstmt.setString(2, owner_up);
            pstmt.setInt(3, hidden_id);
            pstmt.executeUpdate(); //execute query
            pstmt.close(); //close statement
            con.close(); //close connection
            return "UPDATE SUCCESS"; //if valid return "UPDATE SUCCESS" string
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL UPDATE"; //if invalid return "FAIL UPDATE" string
    }
}