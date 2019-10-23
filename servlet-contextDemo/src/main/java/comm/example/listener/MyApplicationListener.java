package comm.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyApplicationListener implements ServletContextListener {
private String email=null;
   
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	email = sce.getServletContext().getInitParameter("email").toString();
    	System.out.println("context destroyed " +email);
    	
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("context initialized " +email);
         // TODO Auto-generated method stub
    }
	
}
