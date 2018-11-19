package com.ivko.helloServlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ManagementSystem {

    private static ManagementSystem instance;

    private ManagementSystem() {
    }

    public static synchronized ManagementSystem getInstance() {
        if (instance == null) {
            instance = new ManagementSystem();
        }
        return instance;
    }

    public List<Contact> getFilteredContacts(String regex, Connection DBConnection) throws SQLException {

        Pattern p = Pattern.compile("");
        try {
            p = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
        }

        if (DBConnection == null) {
            try {
                Context ctx = new InitialContext();
                DataSource dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/ContactsDS");
                DBConnection = dataSource.getConnection();
            } catch (NamingException e) {
                e.printStackTrace();
            }
        }

        List<Contact> contacts = new ArrayList<Contact>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DBConnection.createStatement();
            stmt.setFetchSize(1);
            rs = stmt.executeQuery("SELECT id, name FROM contacts");

            while (rs.next()) {
                String contactString = rs.getString(2);
                Matcher m = p.matcher(contactString);
                if (!m.matches()) {
                    Contact sr = new Contact();
                    sr.setId(rs.getInt(1));
                    sr.setName(contactString);
                    contacts.add(sr);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return contacts;
    }
}