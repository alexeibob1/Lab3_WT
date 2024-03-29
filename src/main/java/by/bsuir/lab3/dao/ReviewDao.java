package by.bsuir.lab3.dao;

import by.bsuir.lab3.entity.Review;
import by.bsuir.lab3.exception.DaoException;

import java.util.List;

public interface ReviewDao extends Dao<Review> {

    List<Review> getReviews(Long movieId, Long userId) throws DaoException;

    List<Review> findReviewsByMovieId(Long movieId) throws DaoException;

    void deleteReview(Long reviewId) throws DaoException;
}
