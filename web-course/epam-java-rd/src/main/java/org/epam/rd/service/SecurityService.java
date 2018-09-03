package org.epam.rd.service;

import org.epam.rd.model.AppUser;


public interface SecurityService {

    boolean isCorrectPassword(AppUser user, String password);
}
