package com.data.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.data.movie.model.MovieList;

@Repository
public class movieDAOImpl implements movieDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<MovieList> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<MovieList> query = currentSession.createQuery("from MovieList", MovieList.class);
		List<MovieList> movieList = query.getResultList();
		return movieList;
	}

}
