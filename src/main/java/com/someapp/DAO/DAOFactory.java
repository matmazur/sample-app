package com.someapp.DAO;

import com.someapp.DAO.modelDAO.interfaces.DiscoveryDAO;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.DAO.modelDAO.interfaces.VoteDAO;

public abstract class DAOFactory {

    public abstract DiscoveryDAO getDiscoveryDao();
    public abstract UserDAO getUserDao();
    public abstract VoteDAO getVoteDao();


}
