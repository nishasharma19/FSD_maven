package comm.example.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import comm.example.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setFirstName(rs.getString("firstName"));
		customer.setSecondName(rs.getString("secondName"));
		customer.setEmail(rs.getString("email"));
		return customer;
	}

}
