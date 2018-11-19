package com.ivko.helloServlet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Contact {
    private int id;
    private String name;

    public Contact() {
    }

    public Contact(ResultSet rs) throws SQLException {
        setId(rs.getInt(1));
        setName(rs.getString(2));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact [Id=" + id + ", Name=" + name + "]";
    }
}