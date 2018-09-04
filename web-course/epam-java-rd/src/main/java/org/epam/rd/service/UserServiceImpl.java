package org.epam.rd.service;

import org.epam.rd.config.PropertiesManager;
import org.epam.rd.converter.AppUserConverter;
import org.epam.rd.dao.AppUserDao;
import org.epam.rd.dao.AppUserDaoImpl;
import org.epam.rd.dao.DBManager;
import org.epam.rd.exception.ApplicationException;
import org.epam.rd.exception.ValidationException;
import org.epam.rd.model.AppUser;
import org.epam.rd.validator.UserValidator;
import org.epam.rd.validator.UserValidatorImpl;
import org.epam.rd.web.dto.AppUserCreateDto;
import org.epam.rd.web.dto.AppUserViewDto;

import java.sql.*;
import java.util.Properties;


public class UserServiceImpl implements UserService {
    private AppUserDao appUserDao = new AppUserDaoImpl();
    private UserValidator userValidator = new UserValidatorImpl();
    private AppUserConverter appUserConverter = new AppUserConverter();
//    private SecurityService securityService = new SecurityServiceImpl();
//    private DBManager dbManager = new DBManager();
//    private PropertiesManager propertiesManager = new PropertiesManager();

//    @Override
//    public AppUserViewDto login(String email, String password) {
//        userValidator.validateUserCredentials(email, password);
//        AppUser user = appUserDao.getByEmail(email);
//        if (!securityService.isCorrectPassword(user, password)) {
//            throw new ValidationException("Wrong password");
//        }
//        return appUserConverter.asUserDto(user);
//    }

    @Override
    public AppUserViewDto registerUser(AppUserCreateDto createDto) {
        userValidator.validateNewUser(createDto);
        AppUser user = appUserConverter.asAppUser(createDto);
        if (!createDto.getEmail().equals(user.getEmail())) {
            user = appUserDao.create(user);
        } else {
            throw new ApplicationException("User already exists");
        }
        return appUserConverter.asUserDto(user);
    }
}