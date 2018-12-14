package itstep.dao.mapper;

import springApp.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setAge(resultSet.getInt("age"));
        user.setName(resultSet.getString("name"));
        return user;
    }
}
