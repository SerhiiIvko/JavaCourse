package org.epam.rd.dao;

import org.epam.rd.config.PropertiesManager;
import org.epam.rd.exception.ApplicationException;
import org.h2.tools.RunScript;
import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBManager {

    private static final String SCHEMA_SCRIPT = "schema.sql";
    private static final String DATA_SCRIPT = "data.sql";

    private static Server server;

    public static void prepareDb(Properties properties) {
        try {
            server = Server.createTcpServer("-tcpAllowOthers").start();
            Class.forName("org.h2.Driver");
            Connection connection = getConnection(properties);
            RunScript.execute(connection, PropertiesManager.loadScript(SCHEMA_SCRIPT));
            RunScript.execute(connection, PropertiesManager.loadScript(DATA_SCRIPT));
        } catch (Exception e) {
            throw new ApplicationException("Failed to start the DB", e);
        }
    }

    public static void stopDb() {
        if (server != null) {
            server.stop();
        }
    }

    public static Connection getConnection(Properties properties) {
        try {
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new ApplicationException("Failed to open the DB connection", e);
        }
    }

}
