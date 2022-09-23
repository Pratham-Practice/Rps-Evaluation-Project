package com.example.Customerservice.fisCustomerrservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customerservice.fisCustomerrservice.model.Customer;
import com.example.Customerservice.fisCustomerrservice.model.MoviesDto;
import com.example.Customerservice.fisCustomerrservice.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> DisplayAll(){
		return service.getallCustomer();
	}
	
	@PostMapping("/add")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	

	@PostMapping("/update")
	public Customer UpdateCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/delete/{customer_id}")
	public String deleteMovie(@PathVariable("customer_id") int customer_id) {
		return service.deleteCustomer(customer_id);
	}
	@GetMapping("/search/{type}")
	public List<MoviesDto> searchMovieByType(@PathVariable("type") String type){
		return service.findbyType(type);
	}
	
	@GetMapping("/search/actor/{type}")
	public List<MoviesDto> searchMovieBylead(@PathVariable("type") String type){
		return service.findbyLead(type) ;
	}

	
}
