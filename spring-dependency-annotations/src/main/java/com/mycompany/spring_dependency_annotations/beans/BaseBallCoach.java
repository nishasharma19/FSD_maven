package com.mycompany.spring_dependency_annotations.beans;

public class BaseBallCoach implements Coach {
	public Fortune fortune;
	@Override
	public String dailyWorkout() {
		// TODO Auto-generated method stub
		return "Repeat yesterdyas routine";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}

	public BaseBallCoach() {
		super();
	}

	public BaseBallCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

}
