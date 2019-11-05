package comm.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import comm.example.model.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// when lombok is not used
//	public CustomerDAOImpl() {
//		super();
//	}
//	public CustomerDAOImpl(JdbcTemplate jdbcTemplate) {
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}
//	

	@Override
	public void cretaeCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(firstName,secondName,email) values (?,?,?)", customer.getFirstName(),
				customer.getSecondName(), customer.getEmail());

	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update customer set firstName=(?), secondName=(?), email=(?) where id=19",
				customer.getFirstName(), customer.getSecondName(), customer.getEmail());
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select firstName,secondName,email from customer", new CustomerMapper());
	}

//	private DataSource dataSource;
//
//	@Override
//	public void cretaeCustomer(Customer customer) {
//		Connection connection = null;
//		Statement statement = null;
//		PreparedStatement pStatement = null;
//		{
//			try {
//				connection = dataSource.getConnection();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		// TODO Auto-generated method stub
//		try {
//			pStatement = connection
//					.prepareStatement("insert into customer (firstName, secondName, email) values (?,?,?)");
//			pStatement.setString(1, customer.getFirstName());
//			pStatement.setString(2, customer.getSecondName());
//			pStatement.setString(3, customer.getEmail());
//			pStatement.execute();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public CustomerDAOImpl(DataSource dataSource) {
//		super();
//		this.dataSource = dataSource;
//	}

//	@Override
//	public void getAllCustomer() {
//		// TODO Auto-generated method stub
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		{
//			try {
//				connection = dataSource.getConnection();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		try {
//			statement = connection.createStatement();
//			resultSet = statement.executeQuery("select * from customer");
//			
//			
//			System.out.println("FirstName\t Lastname\t Email ");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getString("firstName")+"\t "+resultSet.getString("secondName")+"\t "+resultSet.getString("email"));
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

}
