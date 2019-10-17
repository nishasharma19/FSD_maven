package com.myCompany.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
   			   addAnnotatedClass(Instructor.class). addAnnotatedClass(Details.class).buildSessionFactory();
    	  
   	   Session session=factory.getCurrentSession();
        Details d = new Details();
        d.setYoutubeChannel("http://youtube.com/homie");
        d.setHobby("http://twitter.com/homie");
        Instructor i = new Instructor();
        i.setFirstName("Nisha ");
        i.setLastName("Sharma");
        i.setEmail("nish@gmail.com");
        i.setDetails(d);
        session.getTransaction().begin();
        session.persist(d);
        session.persist(i);
        session.getTransaction().commit();
        session.close();
        System.out.println("success");
        
        
    }
}
