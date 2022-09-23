package com.example.Customerservice.fisCustomerrservice.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class MoviesDto {

	
	int movie_id;
	
	
	String movie_name;
	
	int release_year;
	
	String language;
	
	double rating;
	
	String movie_type;
	
	String movie_category;
	
	String director_name;
	
	String lead_actor_name1;
	
	String lead_actor_name2;
	
	double rental_cost;
	
	public MoviesDto(){
		
	}
	
	
	
	
	public MoviesDto(int movie_id, String movie_name, int release_year, String language, double rating, String movie_type,
			String movie_category, String director_name, String lead_actor_name1, String lead_actor_name2,
			double rental_cost) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.movie_type = movie_type;
		this.movie_category = movie_category;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		this.rental_cost = rental_cost;
	}




	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	public String getMovie_category() {
		return movie_category;
	}
	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String getLead_actor_name1() {
		return lead_actor_name1;
	}
	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}
	public String getLead_actor_name2() {
		return lead_actor_name2;
	}
	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}
	public double getRental_cost() {
		return rental_cost;
	}
	public void setRental_cost(double rental_cost) {
		this.rental_cost = rental_cost;
	} 

}
