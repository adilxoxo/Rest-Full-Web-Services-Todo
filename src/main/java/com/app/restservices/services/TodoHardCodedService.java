package com.app.restservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.restservices.beans.Todo;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todoList = new ArrayList<Todo>();
	
	static {
		for(int i = 1;i<=10;i++){
			todoList.add(new Todo(i,"adil.sheikh "+i,"Description "+i,new Date(),false));
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
}
