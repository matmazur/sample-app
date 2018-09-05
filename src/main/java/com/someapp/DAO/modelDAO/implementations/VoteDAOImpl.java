package com.someapp.DAO.modelDAO.implementations;

import com.someapp.DAO.modelDAO.interfaces.VoteDAO;
import com.someapp.model.Vote;

import java.util.List;

public class VoteDAOImpl implements VoteDAO {
    @Override
    public Vote getVoteByDiscoveryAndUser(Long userId, Long discoveryId) {
        return null;
    }

    @Override
    public Vote create(Vote newObject) {
        return null;
    }

    @Override
    public Vote read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Vote updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Vote> getAll() {
        return null;
    }
}
