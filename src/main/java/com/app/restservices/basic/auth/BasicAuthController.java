
package com.app.restservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.restservices.beans.AutheticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthController {
	
	@GetMapping(value="/basicauth")
	public AutheticationBean helloWorldBean(){
		return new AutheticationBean("You are authenticated");
		//throw new RuntimeException("Error has occured contact support");
	}
}
