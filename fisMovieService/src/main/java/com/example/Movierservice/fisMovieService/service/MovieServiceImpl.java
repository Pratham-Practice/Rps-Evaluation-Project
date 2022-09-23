package com.example.Movierservice.fisMovieService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movierservice.fisMovieService.model.Movies;
import com.example.Movierservice.fisMovieService.repo.MovieRepository;
@Service
public class MovieServiceImpl implements MoviesService {

	
	
	@Autowired
	private MovieRepository repo;
	
	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Movies insertMovie(Movies movies) {
		// TODO Auto-generated method stub
		return repo.save(movies);
	}

	@Override
	public List<Movies> findbyType(String type) {
		// TODO Auto-generated method stub
		return repo.searchByType(type);
	}

	@Override
	public Movies updateMovie(Movies movies) {
		// TODO Auto-generated method stub
		return repo.save(movies);
	}

	@Override
	public String deleteMovie(int movie_id) {
		// TODO Auto-generated method stub
		repo.deleteById(movie_id);
		return "Recoed Deleted.....";
	}

//	@Override
//	public List<Movies> search(int movie_id) {
//		// TODO Auto-generated method stub
//		return repo.searchByid(movie_id);
//	}

//	@Override
	public List<Movies> findbyLead(String lead_actor_name1) {
		// TODO Auto-generated method stub
		return repo.searchByLead(lead_actor_name1);
	}

	
	

	

}
