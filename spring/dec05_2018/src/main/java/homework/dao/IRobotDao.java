package homework.dao;

import homework.model.Robot;

import java.util.List;

public interface IRobotDao {
    List<Robot> getAll();
}