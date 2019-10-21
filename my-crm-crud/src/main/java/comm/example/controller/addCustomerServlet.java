package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.model.Customer;

@WebServlet("/addCustomer.do")
public class addCustomerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao=null;
	@Override
	public void init() throws ServletException {
		dao=new CustomerDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String fName=request.getParameter("firstname");
		String lName=request.getParameter("secondname");
		String email=request.getParameter("email");
		
		
		
		
		  dao.createCustomer(new Customer(fName, lName, email)); 
		  RequestDispatcher view=request.getRequestDispatcher("list.do");
		  view.forward(request,response);
		 

	}

}
