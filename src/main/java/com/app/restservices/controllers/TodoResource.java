package com.app.restservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.restservices.beans.Todo;
import com.app.restservices.services.TodoHardCodedService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoResource {
	
	@Autowired
	private TodoHardCodedService todoService;
	
	@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {
		return todoService.findAll();
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,@PathVariable long id) {
		Todo todo = todoService.deleteById(id);
		if (todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
