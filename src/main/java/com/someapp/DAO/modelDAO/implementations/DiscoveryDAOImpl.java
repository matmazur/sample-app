package com.someapp.DAO.modelDAO.implementations;

import com.someapp.DAO.modelDAO.interfaces.DiscoveryDAO;
import com.someapp.model.Discovery;

import java.util.List;

public class DiscoveryDAOImpl implements DiscoveryDAO {
    @Override
    public Discovery create(Discovery newObject) {
        return null;
    }

    @Override
    public Discovery read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Discovery updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Discovery> getAll() {
        return null;
    }
}
