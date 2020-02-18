package com.app.restservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.restservices.beans.Todo;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todoList = new ArrayList<Todo>();
	static int idCounter = 0;
	static {
		for(int i = 1;i<=4;i++){
			todoList.add(new Todo(i,"adil.sheikh "+i,"Description "+i,new Date(),false));
			idCounter = i;
		}
	}
	
	public List<Todo> findAll(){
		return todoList;
	}
	
	public Todo deleteById(long id){
		Todo todo = finadById(id);
		
		if(todo!=null)
			todoList.remove(todo);
		
		return todo;
	}

	public Todo finadById(long id) {
		for (Todo todo : todoList) {
			if(todo.getId() == id){
				return todo;
			}
		}
		return null;
	}
	
	public Todo saveTodo(Todo todo){
		if(todo.getId() == -1 || todo.getId() == 0){
			todo.setId(++idCounter);
			todoList.add(todo);
		}else{
			deleteById(todo.getId());
			todoList.add(todo);
		}
		return todo;
	}
}
