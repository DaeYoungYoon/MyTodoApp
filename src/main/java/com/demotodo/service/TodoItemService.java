package com.demotodo.service;

import java.util.List;

import com.demotodo.dto.TodoItemDTO;

public interface TodoItemService {
	
	public List<TodoItemDTO> findTodoItems();
}
