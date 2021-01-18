package com.data.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.movie.dao.movieDAO;
import com.data.movie.model.MovieList;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private movieDAO movieDao;

	
	@Transactional
	@Override
	public List<MovieList> get() {
		return movieDao.get();
	}

}
