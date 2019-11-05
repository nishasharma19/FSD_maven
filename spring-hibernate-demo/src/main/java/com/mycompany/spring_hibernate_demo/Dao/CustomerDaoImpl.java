package com.mycompany.spring_hibernate_demo.Dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_hibernate_demo.entity.Customer;

import lombok.AllArgsConstructor;

@Repository("customerDao")
@AllArgsConstructor
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.openSession();
		session.save(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllElemets() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query = session.createQuery("from customer", Customer.class);
		return query.getResultList();
		
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	
	}

	@Override
	public List<Customer> getCustomerByFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

}
