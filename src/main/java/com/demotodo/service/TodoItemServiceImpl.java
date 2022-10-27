package com.demotodo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demotodo.mapper.TodoItemMapper;

@Service
public class TodoItemServiceImpl implements TodoItemService {
	
	@Autowired
	TodoItemMapper todoItemMapper;

	@Override
	public Map<String, Object> selectTodoItems() {
		return todoItemMapper.selectTodoItems();
	}
	
}
