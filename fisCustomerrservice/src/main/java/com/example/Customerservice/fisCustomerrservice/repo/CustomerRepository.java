package com.example.Customerservice.fisCustomerrservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customerservice.fisCustomerrservice.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
