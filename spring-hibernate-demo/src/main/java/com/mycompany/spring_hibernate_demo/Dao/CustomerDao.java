package com.mycompany.spring_hibernate_demo.Dao;

import java.util.List;

import com.mycompany.spring_hibernate_demo.entity.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllElemets();
	public Customer getCustomerById(int id);
	public List<Customer> getCustomerByFirstName();
	
}
