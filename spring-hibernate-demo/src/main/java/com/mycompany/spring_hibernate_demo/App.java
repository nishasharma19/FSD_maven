package com.mycompany.spring_hibernate_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_hibernate_demo.entity.Customer;
import com.mycompany.spring_hibernate_demo.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = context.getBean("customerService", CustomerService.class);
		Customer customer = service.createCustomer(new Customer("Farheen", "shaik", "shaikFarheen@gmail.com"));
		System.out.println(customer);
	}
}
