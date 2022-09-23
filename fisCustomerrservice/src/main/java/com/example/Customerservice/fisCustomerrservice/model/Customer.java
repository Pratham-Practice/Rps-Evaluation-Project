package com.example.Customerservice.fisCustomerrservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	int customer_id;
	
	@Column
	String customer_name;
	
	@Column
	String contact_number;
	
	@Column
	String customer_adress;
	
	@Column
	String date_of_regestration;
	
	@Column
	int age;
	
	public Customer() {
		
	}
	
	
	
	
	
	
	public Customer(int customer_id, String customer_name, String contact_number, String customer_adress,
			String date_of_regestration, int age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.contact_number = contact_number;
		this.customer_adress = customer_adress;
		this.date_of_regestration = date_of_regestration;
		this.age = age;
	}






	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getContact_number() {
		return contact_number;
	}






	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}






	public String getCustomer_adress() {
		return customer_adress;
	}
	public void setCustomer_adress(String customer_adress) {
		this.customer_adress = customer_adress;
	}
	public String getDate_of_regestration() {
		return date_of_regestration;
	}
	public void setDate_of_regestration(String date_of_regestration) {
		this.date_of_regestration = date_of_regestration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
