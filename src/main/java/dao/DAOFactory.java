package dao;

import com.someapp.model.Discovery;

public abstract class DAOFactory {

    public abstract DiscoveryDao getDiscoveryDao();
    public abstract UserDao getUserDao();
    public abstract VoteDao getVoteDao();


}
