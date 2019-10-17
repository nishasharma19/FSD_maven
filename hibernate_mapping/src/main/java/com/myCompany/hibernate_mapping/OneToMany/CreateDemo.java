package com.myCompany.hibernate_mapping.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_mapping.Details;
import com.myCompany.hibernate_mapping.Instructor;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Details.class).addAnnotatedClass(Courses.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@luv2code.com");

			Details tempInstructorDetail = new Details("http://www.youtube.com", "Guitar");

			tempInstructor.setDetails(tempInstructorDetail);

			session.beginTransaction();

			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
