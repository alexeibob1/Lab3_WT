package by.bsuir.lab3.dao;

import by.bsuir.lab3.entity.Movie;
import by.bsuir.lab3.exception.DaoException;

public interface MovieDao extends Dao<Movie> {

    void updateMovie(Movie movie) throws DaoException;
}
