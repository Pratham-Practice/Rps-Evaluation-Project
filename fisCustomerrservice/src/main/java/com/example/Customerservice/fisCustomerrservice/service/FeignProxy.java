package com.example.Customerservice.fisCustomerrservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Customerservice.fisCustomerrservice.model.MoviesDto;



@FeignClient(name="MovieService")// , url = "http://MOVIESERVICE/movies")
public interface FeignProxy {
	
	
	@GetMapping("/movies/search/{type}")
	public List<MoviesDto> getMovieByType(@PathVariable("type") String type);
	
	@GetMapping("/movies/search/actor/{lead_actor_name1}")
	public List<MoviesDto> getMovieByLead(@PathVariable("lead_actor_name1") String lead_actor_name1);

}
