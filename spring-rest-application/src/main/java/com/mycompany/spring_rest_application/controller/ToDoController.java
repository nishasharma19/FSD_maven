package com.mycompany.spring_rest_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/todo")
public class ToDoController {

	
		@RequestMapping(value="/add")
		public String add() {
			return "add-form";
		}
}
