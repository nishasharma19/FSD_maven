package com.mycompany.spring_dependency_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_dependency_annotations.beans.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = null;
        try {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			Coach myCoach = context.getBean("theCoach", Coach.class);
			System.out.println("Your Coach Details: " +myCoach.dailyWorkout());
			System.out.println("This is for you: " +myCoach.getFortune());
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
