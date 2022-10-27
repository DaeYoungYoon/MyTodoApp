package com.demotodo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoItemMapper {
	
	public Map<String, Object> selectTodoItems();
}
