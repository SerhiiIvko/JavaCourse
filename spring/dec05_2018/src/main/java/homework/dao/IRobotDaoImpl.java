package homework.dao;

import homework.dao.mapper.RobotMapper;
import homework.model.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class IRobotDaoImpl implements IRobotDao {

    @Autowired
    public JdbcTemplate template;

    @Override
    public List<Robot> getAll() {
        return template.query("SELECT * FROM robots", new RobotMapper());
    }
}