package org.epam.rd.validator;

import org.epam.rd.web.dto.AppUserCreateDto;

public interface UserValidator {

    void validateUserCredentials(String email, String password);
    void validateNewUser(AppUserCreateDto createDto);
}
