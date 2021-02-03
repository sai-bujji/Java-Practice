package com.practice.business;

import java.util.ArrayList;
import java.util.List;

import com.practice.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos= todoService.retrieveTodos(user);
		
		for(String todo: todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
