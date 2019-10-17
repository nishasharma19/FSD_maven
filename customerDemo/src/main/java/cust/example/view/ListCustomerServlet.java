package cust.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cust.example.model.Customer;

/**
 * Servlet implementation class ListCustomerServlet
 */
public class ListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Customer> list = null;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		list = new ArrayList<Customer>();
		list.add(new Customer("Veronica", 1, "Normal"));
		list.add(new Customer("Jones", 2, "Corporate"));
		out.println("<html><title>List all Available Customer</title><body><table border='1'><tr><td>ID</td><td>Name</td><td>Type</td></tr>");
		
		for(Customer l:list) {
			out.println("<tr><td>"+l.getId()+"</td><td>"+l.getName()+"</td><td>"+l.getType()+"</td></tr>");
			
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
	}

}
