package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDo;
import com.example.demo.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoRepository toDoRepo;
	
	@Override
	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoRepo.findAll();
	}

	@Override
	public void saveToDo(ToDo todo) {
		// TODO Auto-generated method stub
		toDoRepo.save(todo);
	}

}
