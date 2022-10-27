package com.demotodo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demotodo.dto.TodoItemDTO;
import com.demotodo.service.TodoItemServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TodoAppController {
	
	@Autowired
	TodoItemServiceImpl todoItemServiceImpl;
	
	@GetMapping(path = "/selectTodoItems")
	public Map<String, Object> selectTodoItems() {
		HashMap<String, Object> map = (HashMap<String, Object>) todoItemServiceImpl.selectTodoItems();
		
		return map;
	}
	
	@PostMapping(path = "/insertTodoItem")
	public Map<String, Object> insertTodoItem(@RequestBody TodoItemDTO todoItemDTO) {
		HashMap<String, Object> responseMap = new HashMap<>();
		return responseMap;
	}
	

}
