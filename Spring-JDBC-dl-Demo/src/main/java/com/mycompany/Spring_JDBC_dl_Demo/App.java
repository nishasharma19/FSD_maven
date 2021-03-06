package com.mycompany.Spring_JDBC_dl_Demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import comm.example.DAO.CustomerDAO;
import comm.example.DAO.CustomerDAOImpl;
import comm.example.DAO.Jdbcconfig;
import comm.example.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {

			AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(Jdbcconfig.class);
			CustomerDAO customerDAO = context.getBean("customerDAOImpl", CustomerDAOImpl.class);

			customerDAO.cretaeCustomer(new Customer("Krissann", "B", "krissy@hot.com"));
			System.out.println("ok!");
//			customerDAO.updateCustomer(new Customer("Chirs", "Jhon", "chirssy@gmail.com"));
//			System.out.println("updated");
			
			List<Customer> list=customerDAO.getAllCustomer(); 
			Iterator<Customer> i=list.iterator(); 
			while(i.hasNext()) 
			{ 
				Customer c=i.next();
			  System.out.println(c.getFirstName()+" , "+c.getSecondName()+" , "+c.getEmail()); }
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    }
}
