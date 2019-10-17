package com.myCompany.hibernate_mapping.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_mapping.Details;
import com.myCompany.hibernate_mapping.Instructor;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Details.class).addAnnotatedClass(Courses.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			int theId = 2;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			Courses tempCourse1 = new Courses("Air Guitar");
			Courses tempCourse2 = new Courses("Masterclass");
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}

