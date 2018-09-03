package org.epam.rd.converter;

import org.epam.rd.model.AppUser;
import org.epam.rd.web.dto.AppUserCreateDto;
import org.epam.rd.web.dto.AppUserViewDto;


public class AppUserConverter {

    public AppUserViewDto asUserDto(AppUser user) {
        AppUserViewDto dto = new AppUserViewDto();
        dto.setAge(user.getAge());
        dto.setId(user.getId());
        dto.setSurname(user.getSurname());
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        return dto;
    }

    public AppUser asAppUser(AppUserCreateDto createDto) {
        AppUser user = new AppUser();
        user.setEmail(createDto.getEmail());
        user.setPassword(createDto.getPassword());
        user.setName(createDto.getName());
        user.setSurname(createDto.getSurname());
        user.setAge(createDto.getAge());
        return user;
    }
}
