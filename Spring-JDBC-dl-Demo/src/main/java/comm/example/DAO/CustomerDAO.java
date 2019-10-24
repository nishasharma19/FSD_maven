package comm.example.DAO;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	public void cretaeCustomer(Customer customer);
	//public void getAllCustomer();
	public void updateCustomer(Customer customer);

	public List<Customer> getAllCustomer();
}
