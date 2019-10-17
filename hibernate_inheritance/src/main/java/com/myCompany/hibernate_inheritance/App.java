package com.myCompany.hibernate_inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_inheritance.model.Account;
import com.myCompany.hibernate_inheritance.model.Current;
import com.myCompany.hibernate_inheritance.model.Savings;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        try {
        	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class).addAnnotatedClass(Savings.class).addAnnotatedClass(Current.class).buildSessionFactory();
        	Session session = factory.openSession();
        	Account account =  new Account("Nisha", "karb00023",(float) 7.5);
        	Savings savings =  new Savings("Sejal", "kab000023", 6, 2);
        	Current current = new Current("krishna", "karb000479", 8, 34);        	
        	session.getTransaction().begin();
        	session.save(account);
        	session.save(savings);
        	session.save(current);
        	session.getTransaction().commit();
        	System.out.println("done");
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
