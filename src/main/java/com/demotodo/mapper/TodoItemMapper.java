package com.demotodo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demotodo.dto.TodoItemDTO;

@Mapper
public interface TodoItemMapper {
	
	public List<TodoItemDTO> selectTodoItems();
}
