package org.customer.module;

import java.util.List;
import java.util.Scanner;

import org.customer.module.factory.CustomerFactoryImpl;
import org.customer.module.factory.customerFactory;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			customerFactory impl = new CustomerFactoryImpl();
			

			int choice;
			do {
				System.out.println("1. Create Customer");
				System.out.println("2. Display all customer");
				System.out.println("3. Find Customer by ID");
				System.out.println("4. Update Customer");
				System.out.println("5. Remove Customer");
				System.out.println("6. Exit");
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("ID:");
					int id = scanner.nextInt();
					System.out.println("NAME:");
					String name = scanner.next();
					System.out.println("EMAIL:");
					String email = scanner.next();

					Customer customer = impl.createCustomer(id, name, email);
					System.out.println(customer.toString());
					break;
				case 2:
					List<Customer> list = impl.getAllCustomer();
					for (Customer c : list) {
						System.out.println(c);
					}
					break;
				case 3:
					System.out.println("Enter id to search:");
					id = scanner.nextInt();
					impl.findById(id);

					break;
				case 0:
					System.out.println("Bye");
					System.exit(0);
					break;
				case 4:
					System.out.println("Enter id to update");
					id= scanner.nextInt();
					impl.updateCustomer(id);
				}
			} while (choice != 0);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
