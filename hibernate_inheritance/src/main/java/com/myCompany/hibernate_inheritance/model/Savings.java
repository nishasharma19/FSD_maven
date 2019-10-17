package com.myCompany.hibernate_inheritance.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("savings")
public class Savings extends Account {

	private int deposit;

	public Savings() {

	}

	public Savings(String holder, String ifsc, float interset, int deposit) {
		super(holder, ifsc, interset);
		this.deposit = deposit;

	}

}
