package com.example.Movierservice.fisMovieService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movierservice.fisMovieService.model.Movies;

//@Service
public interface MoviesService {
	
	public List<Movies> getAllMovies();
	public Movies insertMovie(Movies movies);
	public Movies updateMovie(Movies movies);
	public String deleteMovie(int movie_id);
	//public List<Movies> search(int movie_id);
	
	public List<Movies> findbyType(String type);
	public List<Movies> findbyLead(String lead_actor_name1);


}
