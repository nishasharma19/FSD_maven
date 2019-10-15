package com.myCompany.hibernate_crud_demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name="employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803209005339572687L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "generated_id")
	private String generatedId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
}
