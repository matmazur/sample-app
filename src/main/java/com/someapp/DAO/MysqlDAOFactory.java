package com.someapp.DAO;

import com.someapp.DAO.modelDAO.implementations.DiscoveryDAOImpl;
import com.someapp.DAO.modelDAO.implementations.UserDAOImpl;
import com.someapp.DAO.modelDAO.implementations.VoteDAOImpl;
import com.someapp.DAO.modelDAO.interfaces.DiscoveryDAO;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.DAO.modelDAO.interfaces.VoteDAO;

public class MysqlDAOFactory extends DAOFactory {
    @Override
    public DiscoveryDAO getDiscoveryDAO() {
        return new DiscoveryDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImpl();

    }

    @Override
    public VoteDAO getVoteDAO() {
        return new VoteDAOImpl();

    }
}
