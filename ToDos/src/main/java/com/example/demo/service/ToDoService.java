package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ToDo;

public interface ToDoService {
	public List<ToDo> getAllToDo();

	public void saveToDo(ToDo todo);

}
