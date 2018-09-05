package com.someapp.DAO.modelDAO.interfaces;

import com.someapp.DAO.GenericDAO;
import com.someapp.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User,Long> {

    List<User> getAll();
    User getUserByUsername(String username);

}
