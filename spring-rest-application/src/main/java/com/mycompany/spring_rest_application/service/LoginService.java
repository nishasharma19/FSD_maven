package com.mycompany.spring_rest_application.service;

public interface LoginService {
	public boolean validateUsername(String username);
	public boolean validatePassword(String password);

}
