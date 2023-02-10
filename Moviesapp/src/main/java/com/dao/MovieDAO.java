package com.dao;

import java.util.List;

import com.entity.Movie;

public interface MovieDAO {
    public List < Movie > getMovies();

    public void saveMovier(Movie theCustomer);

    public Movie getMovie(int theId);

    public void deleteMovie(int theId);

}
