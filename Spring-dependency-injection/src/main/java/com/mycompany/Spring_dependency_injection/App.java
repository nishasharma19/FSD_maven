package com.mycompany.Spring_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.Spring_dependency_injection.beans.Coach;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");

			Coach myCoach = context.getBean("theCoach", Coach.class);
			System.out.println("Coach Details" +myCoach.toString());
			System.out.println("Daily Workout Plan " + myCoach.getDailyWorkout());
			System.out.println("fortune of the day " + myCoach.getDailyFortune());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
