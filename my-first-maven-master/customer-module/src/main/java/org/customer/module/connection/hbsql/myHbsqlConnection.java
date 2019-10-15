package org.customer.module.connection.hbsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myHbsqlConnection {
	private static Connection connection = null;

	private myHbsqlConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CustomerDetails", "root", "pass@word1");

	}

	public static Connection getMyConnection() throws SQLException {
		if (connection == null) {
			new myHbsqlConnection();
		}
		return connection;
	}
}
