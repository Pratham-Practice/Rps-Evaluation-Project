package com.example.Movierservice.fisMovieService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movierservice.fisMovieService.model.Movies;
import com.example.Movierservice.fisMovieService.service.MoviesService;

@RestController
@RequestMapping("/movies")
public class MoviesContrller {

	
	@Autowired
	private MoviesService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Movies>> getAll(){
		return new ResponseEntity<>(service.getAllMovies() ,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public Movies addMovie(@RequestBody Movies movies) {
		return service.insertMovie(movies);
		
	}
	
	@PostMapping("/update")
	public Movies updateMovie(@RequestBody Movies movies) {
		return service.insertMovie(movies);
		
	}
	
	@DeleteMapping("/delete/{movie_id}")
	public String deleteMovie(@PathVariable("movie_id") int movie_id) {
		return service.deleteMovie(movie_id);
		
	}
	
	@GetMapping("/search/{type}")
	public ResponseEntity<List<Movies>> getMovieByType(@PathVariable("type") String type){
		return new ResponseEntity<>(service.findbyType(type) , HttpStatus.OK);
		
	}
	
//	@GetMapping("/search/{movie_id}")
//	public ResponseEntity<List<Movies>> getMovieById(@PathVariable("movie_id") int movie_id){
//		return new ResponseEntity<>(service.search(movie_id) , HttpStatus.OK);
//		
//	}
//	
	@GetMapping("/search/actor/{lead_actor_name1}")
	public ResponseEntity<List<Movies>> getMovieByLead(@PathVariable("lead_actor_name1") String lead_actor_name1){
		return new ResponseEntity<>(service.findbyLead(lead_actor_name1) , HttpStatus.OK);
		
	}
	
	
}
