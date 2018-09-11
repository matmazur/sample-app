package com.someapp.DAO;

import com.someapp.DAO.modelDAO.interfaces.DiscoveryDAO;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.DAO.modelDAO.interfaces.VoteDAO;
import com.someapp.exceptions.NoSuchDatabaseException;

public abstract class DAOFactory {

    public static final int MYSQL_DAO_FACTORY = 1;


    public abstract DiscoveryDAO getDiscoveryDAO();

    public abstract UserDAO getUserDAO();

    public abstract VoteDAO getVoteDAO();


    public static DAOFactory getDAOFactory() {
        DAOFactory factory = null;

        try {
            factory = getDAOFactory(MYSQL_DAO_FACTORY);

        } catch (NoSuchDatabaseException e) {
            e.printStackTrace();
        }

        return factory;
    }

    private static DAOFactory getDAOFactory(int type) throws NoSuchDatabaseException {
        switch (type) {
            case MYSQL_DAO_FACTORY:
                return new MysqlDAOFactory();
            default:
                throw new NoSuchDatabaseException();
        }
    }
}