package homework.dao.mapper;

import homework.model.Robot;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RobotMapper implements RowMapper<Robot> {

    @Override
    public Robot mapRow(ResultSet resultSet, int i) throws SQLException {
        Robot robot = new Robot();
        robot.setId(resultSet.getInt("id"));
        robot.setName(resultSet.getString("name"));
        robot.setModel(resultSet.getString("model"));
        return robot;
    }
}