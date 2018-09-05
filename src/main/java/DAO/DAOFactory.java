package DAO;

import DAO.modelDAO.UserDAO;

public abstract class DAOFactory {

    public abstract DiscoveryDao getDiscoveryDao();
    public abstract UserDAO getUserDao();
    public abstract VoteDao getVoteDao();


}
