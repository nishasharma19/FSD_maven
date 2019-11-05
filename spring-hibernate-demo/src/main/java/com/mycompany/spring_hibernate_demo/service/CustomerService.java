package com.mycompany.spring_hibernate_demo.service;

import java.util.List;

import com.mycompany.spring_hibernate_demo.entity.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByid(int id);
}
