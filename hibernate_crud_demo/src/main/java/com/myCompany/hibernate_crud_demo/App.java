package com.myCompany.hibernate_crud_demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myCompany.hibernate_crud_demo.dao.EmployeeDAO;
import com.myCompany.hibernate_crud_demo.dao.EmployeeDAOImpl;
import com.myCompany.hibernate_crud_demo.model.Employee;
import com.myCompany.hibernate_crud_demo.shared.SharedEmployee;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		try {
			int choice = 0;
			do {
				System.out.println("1.create employee.");
				System.out.println("2.display all available employee.");
				System.out.println("3.find employee by id.");
				System.out.println("4.find employee by custom id.");
				System.out.println("5.remove by id.");
				System.out.println("0.exit");
				System.out.print("your choice: ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("First Name");
					String fName = scanner.next();

					System.out.println("Last Name");
					String lName = scanner.next();

					System.out.println("Email");
					String email = scanner.next();

					dao.createEmployee(new SharedEmployee(fName, lName, email));
					System.out.println("inserted");
					break;
				case 2:
					List<SharedEmployee> se = dao.getAllEmployee();
					for (SharedEmployee see : se) {
						System.out.printf("%s %s %s", see.getFirstName(), see.getLastName(), see.getEmail());
					}
					break;
				case 3:
					System.out.println("Enter Employee Id");
					int id = scanner.nextInt();
					SharedEmployee sEmployee = dao.findById(id);
					if (sEmployee == null) {
						System.out.println("No such record found");
					} else {
						System.out.println(sEmployee);
					}
					break;
				case 4:
					System.out.println("custom id: ");
					String cid = scanner.next();
					dao.findByCustomId(cid);
					break;
				case 5:
					System.out.print("enter employee id: ");
					id = scanner.nextInt();
					dao.deleteEmployee(id);
					break;
				default:
					break;

				}

			} while (choice != 0);

		} catch (Exception e) {

		}
	}
}
