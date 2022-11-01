package com.demotodo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demotodo.dto.TodoItemDTO;
import com.demotodo.mapper.TodoItemMapper;

@Service
public class TodoItemServiceImpl implements TodoItemService {
	
	@Autowired
	TodoItemMapper todoItemMapper;

	@Override
	public List<TodoItemDTO> findTodoItems() {
		return todoItemMapper.selectTodoItems();
	}
	
}
