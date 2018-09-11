package com.someapp.DAO.modelDAO.services;

import com.someapp.DAO.DAOFactory;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.model.User;

public class UserService {

    public void addUser(String username, String password, String email){

        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);

        UserDAO factory = DAOFactory.getDAOFactory().getUserDAO();
        factory.create(user);

    }
}
