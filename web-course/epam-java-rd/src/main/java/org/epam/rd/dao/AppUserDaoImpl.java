package org.epam.rd.dao;

import org.epam.rd.config.PropertiesManager;
import org.epam.rd.exception.ApplicationException;
import org.epam.rd.model.AppUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class AppUserDaoImpl implements AppUserDao {

    private PropertiesManager propertiesManager = new PropertiesManager();

    private static final String USER_BY_EMAIL_QUERY = "select * from app_user where email = '%s'";
    @Override
    public AppUser getByEmail(String email) {
        AppUser user = null;
        try (Connection connection = retrieveConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(String.format(USER_BY_EMAIL_QUERY, email));
            while (resultSet.next()) {
                user = new AppUser();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
            }
        } catch (Exception e) {
            throw new ApplicationException("Failed to load user from DB", e);
        }
        if (user == null) {
            throw new ApplicationException("User not found by email: " + email);
        }
        return user;
    }

    private static final String INSER_USER_QUERY = "insert into app_user (name, surname, age, email, password) values (?, ?, ?, ?, ?)";
    @Override
    public AppUser create(AppUser user) {
        try (Connection connection = retrieveConnection();
             PreparedStatement statement = connection.prepareStatement(INSER_USER_QUERY)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getSurname());
            statement.setInt(3, user.getAge());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setId(generatedKeys.getLong(1));
            }
        } catch (Exception e) {
            throw new ApplicationException("Failed to insert user into DB", e);
        }
        return user;
    }

    private Connection retrieveConnection() {
        return DBManager.getConnection(propertiesManager.getApplicationProperties());
    }
}
