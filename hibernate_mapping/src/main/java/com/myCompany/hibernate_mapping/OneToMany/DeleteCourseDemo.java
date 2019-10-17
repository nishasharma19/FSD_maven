package com.myCompany.hibernate_mapping.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_mapping.Details;
import com.myCompany.hibernate_mapping.Instructor;

public class DeleteCourseDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Details.class).addAnnotatedClass(Courses.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 1;
			Courses tempCourse = session.get(Courses.class, theId);

			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}

