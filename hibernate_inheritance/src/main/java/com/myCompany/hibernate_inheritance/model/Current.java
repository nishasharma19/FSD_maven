package com.myCompany.hibernate_inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("current")
public class Current extends Account {
	private int loan;

	public Current(String holder, String ifsc, float interset, int loan) {
		super(holder, ifsc, interset);
		this.loan = loan;
	}

	public Current() {
		
		// TODO Auto-generated constructor stub
	}

}
