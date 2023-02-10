 package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Movie;


@Repository


public class MovieDAOImpl implements MovieDAO {

    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public List<Movie> getMovies() {
	    Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Movie > cq = cb.createQuery(Movie.class);
        Root < Movie > root = cq.from(Movie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
		// TODO Auto-generated method stub
	
	}

	@Override
	public void saveMovier(Movie theMovie) {
		 Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(theMovie);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movie getMovie(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMovie(int theId) {
		// TODO Auto-generated method stub
		
	}

}
