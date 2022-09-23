package com.example.Customerservice.fisCustomerrservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customerservice.fisCustomerrservice.model.Customer;
import com.example.Customerservice.fisCustomerrservice.model.MoviesDto;
import com.example.Customerservice.fisCustomerrservice.repo.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	FeignProxy proxy;
	
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public List<Customer>getallCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		repo.deleteById(customer_id);
		return "Record deleted...";
	}

	@Override
	public List<MoviesDto> findbyType(String type) {
		// TODO Auto-generated method stub
		//String url="http://localhost/movies/search"+type
		//re
		return proxy.getMovieByType(type);
	}

	@Override
	public List<MoviesDto> findbyLead(String lead_actor_name1) {
		// TODO Auto-generated method stub
		return proxy.getMovieByLead(lead_actor_name1);
	}

	

	

}
