package classwork.itstep.dao;

import classwork.itstep.dao.mapper.UserMapper;
import classwork.itstep.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDataBaseDao implements UserDAO {
    @Autowired
    public JdbcTemplate template;

    @Override
    public List<User> getAll() {
        return template.query("SELECT * FROM User", new UserMapper());
    }
}
