package com.mycompany.spring_rest_application.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	@Transactional
	public boolean validateUsername(String username) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("reached service"); System.out.println(username);
		 */
		if(username.equals("dummy")) {
//			System.out.println("true");
			return true;
		}
		else {
//			System.out.println("false");
		return false;}
	}

	@Override
	public boolean validatePassword(String password) {
		// TODO Auto-generated method stub
		
		if(password.equals("dummy")) {
			return true;
		}
		else {
		return false;}
	}

}
