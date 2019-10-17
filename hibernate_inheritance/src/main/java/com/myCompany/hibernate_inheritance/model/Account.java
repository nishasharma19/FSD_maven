package com.myCompany.hibernate_inheritance.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "acc_type")
@DiscriminatorValue("normal")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String holder;
	private String ifsc;
	private float interset;

	public Account() {
	}


	public Account(String holder, String ifsc, float interset) {
		
		
		this.holder = holder;
		this.ifsc = ifsc;
		this.interset = interset;
	}

}
