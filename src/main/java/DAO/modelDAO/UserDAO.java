package DAO.modelDAO;

import DAO.GenericDAO;
import com.someapp.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO {

    List<User> getAll();
    User getUserByUsername(String username);

}
