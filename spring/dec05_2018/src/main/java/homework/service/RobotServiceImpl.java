package homework.service;

import homework.dao.IRobotDao;
import homework.model.Robot;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RobotServiceImpl implements RobotService {

    @Autowired
    IRobotDao dao;

    @Override
    public List<Robot> getAllRobots() {
        return dao.getAll();
    }
}