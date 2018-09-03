package org.epam.rd.validator;

import org.apache.commons.lang3.StringUtils;
import org.epam.rd.dao.AppUserDao;
import org.epam.rd.dao.AppUserDaoImpl;
import org.epam.rd.exception.ValidationException;
import org.epam.rd.web.dto.AppUserCreateDto;

import java.util.Objects;

public class UserValidatorImpl implements UserValidator {

    @Override
    public void validateUserCredentials(String email, String password) {
        if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
            throw new ValidationException("Invalid credentials: " + email);
        }
    }

    @Override
    public void validateNewUser(AppUserCreateDto createDto) {
        validateUserCredentials(createDto.getEmail(), createDto.getPassword());
        if (StringUtils.isEmpty(createDto.getName()) || StringUtils.isEmpty(createDto.getSurname())) {
            throw new ValidationException("Invalid user name info: " + createDto.getName() + ", " + createDto.getSurname());
        }
    }
}
