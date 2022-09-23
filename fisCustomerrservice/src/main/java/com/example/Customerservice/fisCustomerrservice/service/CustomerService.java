package com.example.Customerservice.fisCustomerrservice.service;

import java.util.List;

import com.example.Customerservice.fisCustomerrservice.model.Customer;
import com.example.Customerservice.fisCustomerrservice.model.MoviesDto;
//import com.example.Movierservice.fisMovieService.model.Movies;


public interface CustomerService {
	
	public List<Customer>getallCustomer();
	public Customer insertCustomer(Customer customer);
	//public Movies insertMovie(Movies movies);
	public Customer updateCustomer(Customer customer);
	public String deleteCustomer(int customer_id);

	public List<MoviesDto> findbyType(String type);
	public List<MoviesDto> findbyLead(String lead_actor_name1);

}
