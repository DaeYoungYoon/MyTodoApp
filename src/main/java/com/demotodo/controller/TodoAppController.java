package com.demotodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demotodo.dto.TodoItemDTO;
import com.demotodo.service.TodoItemServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/todo-management")
public class TodoAppController {
	
	@Autowired
	TodoItemServiceImpl todoItemServiceImpl;
	
	@GetMapping(path = "/todos")
	public List<TodoItemDTO> selectTodoItems() {
		List<TodoItemDTO> todoItemDtoList = todoItemServiceImpl.findTodoItems();
		
		return todoItemDtoList;
	}
	
}
