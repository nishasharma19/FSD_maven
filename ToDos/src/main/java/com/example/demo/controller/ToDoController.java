package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ToDo;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/api")
public class ToDoController {
	@Autowired
	private ToDoService todoService;
	
	@GetMapping("/todo")
	public List<ToDo> findall(){
		return todoService.getAllToDo();
	}

	
	@PostMapping("/todo")
	public void save(@RequestBody ToDo todo) {
		todoService.saveToDo(todo);
		
	}
}
