package dao;

import entity.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao extends AbstractDao<User> {

    public UserDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void add(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Plant can not be null");
        }
        try {
            Connection connection = getConnection();
            String insertTableSQL = "INSERT INTO users (name, balance) VALUES(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
            String name = user.getName();
            double balance = user.getBalance();
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, balance);
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User getById(int id) {
        User user = null;
        try {
            Connection connection = getConnection();
            String selectTableSQL = "SELECT * FROM users WHERE id = (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(selectTableSQL);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                user = new User(userId, name, balance);
                closeConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> resultList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String selectAllTableSQL = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllTableSQL);
            while (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                resultList.add(new User(userId, name, balance));
                closeConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultList;
    }

    @Override
    public User update(User user) {
        User updatedUser = null;
        try {
            Connection connection = getConnection();
            String updateTableSQL = "UPDATE users SET name = ?, balance = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setDouble(2, user.getBalance());
            preparedStatement.executeUpdate();
            closeConnection();
            updatedUser = getById(user.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedUser;
    }

    @Override
    public void removeById(int id) {
        try {
            Connection connection = getConnection();
            String deleteFromTableSQL = "DELETE FROM users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteFromTableSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        User user = new User(1, "John", 100);
        UserDao userDao = new UserDao(DataSourceFactory.getMySQLDataSource());
        userDao.add(user);
    }
}