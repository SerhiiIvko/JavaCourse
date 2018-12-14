package itstep.service;

import itstep.dao.UserDAO;
import springApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO dao;

    @Override
    public List<User> getAllUser() {
        return dao.getAll();
    }
}
