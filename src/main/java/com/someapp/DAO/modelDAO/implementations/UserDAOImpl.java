package com.someapp.DAO.modelDAO.implementations;

import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.model.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static final String CREATE_USER = "INSERT INTO user(username, password, email, is_active) VALUES (:username, :password, :email, :is_active);";






    @Override
    public User create(User newObject) {
        return null;
    }

    @Override
    public User read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(User updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
