package com.someapp.DAO;

import com.someapp.DAO.modelDAO.interfaces.DiscoveryDAO;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.DAO.modelDAO.interfaces.VoteDAO;

public abstract class DAOFactory {

    public abstract DiscoveryDAO getDiscoveryDAO();
    public abstract UserDAO getUserDAO();
    public abstract VoteDAO getVoteDAO();


}
