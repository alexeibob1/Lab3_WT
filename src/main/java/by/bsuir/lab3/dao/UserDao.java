package by.bsuir.lab3.dao;

import by.bsuir.lab3.entity.User;
import by.bsuir.lab3.exception.DaoException;

import java.util.Optional;

public interface UserDao extends Dao<User> {

    Optional<User> findByUsername(String username) throws DaoException;

    void updateUser(User user) throws DaoException;
}
