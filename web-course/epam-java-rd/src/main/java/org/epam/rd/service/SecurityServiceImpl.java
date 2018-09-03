package org.epam.rd.service;

import org.epam.rd.model.AppUser;

public class SecurityServiceImpl implements SecurityService {

    @Override
    public boolean isCorrectPassword(AppUser user, String password) {
        return user.getPassword().equals(password);
    }
}
