package com.mycompany.Spring_dependency_injection.beans;

import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {
	private Fortune fortune;
	
	public BaseBallCoach() {
		
	}

	public BaseBallCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back volley today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}

}
