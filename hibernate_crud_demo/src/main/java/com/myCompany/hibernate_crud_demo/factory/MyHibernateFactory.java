package com.myCompany.hibernate_crud_demo.factory;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_crud_demo.model.Employee;

public class MyHibernateFactory {
	private static SessionFactory factory;

	public static SessionFactory getMySession() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		return factory;
	}
}
