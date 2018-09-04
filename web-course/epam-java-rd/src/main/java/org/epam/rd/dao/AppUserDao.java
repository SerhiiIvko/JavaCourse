package org.epam.rd.dao;

import org.epam.rd.model.AppUser;


public interface AppUserDao {

    AppUser getByEmail(String email);

    AppUser create(AppUser user);
}
