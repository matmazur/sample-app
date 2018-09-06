package com.someapp.DAO.modelDAO.interfaces;

import com.someapp.DAO.GenericDAO;
import com.someapp.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

    public Vote getVoteByDiscoveryAndUser(Long userId, Long discoveryId);
}
