package dao;

import com.ibatis.common.jdbc.ScriptRunner;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private DataSource dataSource;
    private static DatabaseManager Instance;

    private static final String SCHEMA_SCRIPT = "schema.sql";
    private static final String DATA_SCRIPT = "data.sql";

    public static DatabaseManager getInstance() {
        if (Instance == null) {
            Instance = new DatabaseManager();
        }
        return Instance;
    }

    private DatabaseManager() {
    }

    public void initialize(Properties properties) {
        dataSource = createMySQLDataSource(properties);
        loadScript(SCHEMA_SCRIPT);
        loadScript(DATA_SCRIPT);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    private DataSource createMySQLDataSource(Properties properties) throws NullPointerException {
        MysqlDataSource mysqlDS;
        mysqlDS = new MysqlDataSource();
        mysqlDS.setUrl(properties.getProperty("MYSQL_URL"));
        mysqlDS.setUser(properties.getProperty("MYSQL_USERNAME"));
        mysqlDS.setPassword(properties.getProperty("MYSQL_PASSWORD"));
//        mysqlDS.setAutoReconnect(true);
//        mysqlDS.setUseSSL(false);
//        mysqlDS.setServerTimezone("UTC");
        return mysqlDS;
    }

    public void loadScript(String scriptName) {
        try {
            Connection connection = dataSource.getConnection();
            ScriptRunner runner = new ScriptRunner(connection, false, true);
            runner.runScript(new BufferedReader(new FileReader(scriptName)));
            dataSource.getConnection().close();
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to start the DB", e);
        }
    }

    public void stopDb() {
        if (dataSource != null) {
            try {
                dataSource.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}