package com.data.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.data.movie.model.MovieList;
import com.data.movie.service.MovieService;




@Controller
public class movieController {

	@Autowired
	private MovieService movieService;
	

	/*
	 * @RequestMapping("/") public ModelAndView get() { ModelAndView mav = new
	 * ModelAndView("movieList"); List<MovieList> list = movieService.get();
	 * mav.addObject("list", list); return mav; }
	 */
	
	/*
	 * @RequestMapping("/") public String index() { return "mo"; }
	 */
	
	
	
	  @RequestMapping("/") 
	  public ModelAndView get() { 
		  ModelAndView mav = new ModelAndView("mo"); 
		  List<MovieList> list = movieService.get();
		  mav.addObject("list", list); 
		  return mav; 
		  }
	 
	 
}
