package com.someapp.DAO.modelDAO.interfaces;

import com.someapp.DAO.GenericDAO;
import com.someapp.model.Discovery;

import java.util.List;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long> {

    List<Discovery> getAll();

}
