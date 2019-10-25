package com.mycompany.spring_dependency_annotations.beans;

public class CricketCoach implements Coach {
	private String email;
	private String teamName;
	private Fortune fortune;
	@Override
	public String dailyWorkout() {
		// TODO Auto-generated method stub
		return "It is time for Cricket";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}

	@Override
	public String toString() {
		return "CricketCoach [email=" + email + ", teamName=" + teamName + ", fortune=" + fortune + "]";
	}

}
