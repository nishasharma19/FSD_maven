package org.customer.module.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.customer.module.Customer;
import org.customer.module.connection.hbsql.myHbsqlConnection;

public class CustomerFactoryImpl implements customerFactory {
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	static Scanner sc = new Scanner(System.in);

	public CustomerFactoryImpl() {
		super();
		try {
			connection = myHbsqlConnection.getMyConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Customer createCustomer(int id, String name, String email) {
		Customer tempcustomer = null;
		// TODO Auto-generated method stub
		try {
			tempcustomer = new Customer(id, name, email);

			pStatement = connection.prepareStatement("insert into customer values(?,?,?)");
			pStatement.setInt(1, tempcustomer.getId());
			pStatement.setString(2, tempcustomer.getName().toString());
			pStatement.setString(3, tempcustomer.getEmail().toString());
			int count = pStatement.executeUpdate();
			System.out.println(count + " row(s) inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tempcustomer;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub

		List<Customer> list = new ArrayList<Customer>();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from customer");
			while (rs.next()) {
				list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public void findById(int id) {
		try {
			int count = -1;
			pStatement = connection.prepareStatement("select * from customer where id=?");
			pStatement.setInt(1, id);
			ResultSet rs = pStatement.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				count++;
			}
			if (count < 0) {
				System.out.println("no such record found...");
			} else {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void findByName(String name) throws SQLException {
		try {
			int count = -1;
			pStatement = connection.prepareStatement("select * from customer where name=?");
			pStatement.setString(1, name);
			ResultSet rs = pStatement.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				count++;
			}
			if (count < 0) {
				System.out.println("no such record found...");
			} else {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
				}
			}
		} catch (Exception e) {

		}
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Updated name: ");
			String name = sc.next();
			System.out.println("Updated email: ");
			String email = sc.next();
			pStatement = connection.prepareStatement("update customer set name=? ,email =? where id=?");
			pStatement.setString(1, name);
			pStatement.setString(2, email);
			pStatement.setInt(3, id);
			int i = pStatement.executeUpdate();
			if (i <= 0) {
				System.out.println("no such id");
			} else {
				System.out.println("updated successfully");
			}

		} catch (Exception e) {

		}
	}

}
