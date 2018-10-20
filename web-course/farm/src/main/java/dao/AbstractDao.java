package dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public abstract class AbstractDao<T> {

    private DataSource dataSource;

    public AbstractDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    protected void closeConnection() throws SQLException {
        dataSource.getConnection().close();
    }

    public abstract void add(T entity);

    public abstract T getById(int id);

    public abstract List<T> getAll();

    public abstract T update(T entity);

//    public abstract void remove(T entity);

    public abstract void removeById(int id);

//    public abstract void removeAll();

    protected static Timestamp getTimeStamp(Date date) {
        return new Timestamp(date.getTime());
    }
}