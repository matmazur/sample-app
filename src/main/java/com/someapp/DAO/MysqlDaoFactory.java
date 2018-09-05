package com.someapp.DAO;

public class MysqlDaoFactory extends DAOFactory {
    @Override
    public DiscoveryDao getDiscoveryDao() {
        return new DiscoveryDaoImpl();
    }

    @Override
    public UserDao getUserDao() {
        return new UserDaoImpl();

    }

    @Override
    public VoteDao getVoteDao() {
        return new UserDaoImpl();

    }
}
