package com.example.Movierservice.fisMovieService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Movierservice.fisMovieService.model.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies,Integer>{

	
	@Query("select u from Movies u where u.movie_type=?1")
	public List<Movies> searchByType(String type);
	
	@Query("select m from Movies m where m.lead_actor_name1=?1")
	public List<Movies> searchByLead(String lead_actor_name1);
	
//	@Query("select u from Movies u where u.movie_id=?1")
//	public List<Movies> searchByid(int id);

}
