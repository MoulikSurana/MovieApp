package com.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MovieDAO;
import com.entity.Movie;
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO movieDAO;
	
	@Override
	@Transactional
	public List<Movie> getMovies() {
		
		// TODO Auto-generated method stub
		return movieDAO.getMovies();
	}

	@Override
	@Transactional
	public void saveMovie(Movie theMovie) {
		// TODO Auto-generated method stub
		movieDAO.saveMovier(theMovie);
		
	}

	@Override
	@Transactional
	public Movie getMovie(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteMovie(int theId) {
		// TODO Auto-generated method stub
		
	}

}
