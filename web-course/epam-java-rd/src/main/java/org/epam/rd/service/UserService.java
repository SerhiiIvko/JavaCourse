package org.epam.rd.service;

import org.epam.rd.web.dto.AppUserCreateDto;
import org.epam.rd.web.dto.AppUserViewDto;


public interface UserService {

    AppUserViewDto login(String email, String password);
    AppUserViewDto registerUser(AppUserCreateDto createDto);
}
