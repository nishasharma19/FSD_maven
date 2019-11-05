package com.mycompany.spring_rest_application.controller;

import java.io.Console;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.spring_rest_application.service.LoginService;
import com.mycompany.spring_rest_application.service.LoginServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private LoginService loginService;
	@RequestMapping(value="/")
	public String test(){
		return "home";
	}
	
	
	@PostMapping(value="/processForm")
	public String processForm(HttpServletRequest request, HttpServletResponse response) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean user = loginService.validateUsername(username);
		boolean pass = loginService.validatePassword(password);
		if(user && pass) {
			return "welcome";
		}else {
			request.setAttribute("errorMessage", "Invalid UserName or Password");
			return "home";
		}
		
	}
}
