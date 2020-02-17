
package com.app.restservices.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.restservices.beans.HelloWorldBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@GetMapping(value="/helloWorld")
	public String helloWorld(){
		return "Hello World U";
	}
	
	@GetMapping(value="/helloWorldBean")
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("Hello World Changed");
		//throw new RuntimeException("Error has occured contact support");
	}
	
	@GetMapping(value="/helloWorld/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVar(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello World, %s ", name));
	}
}
