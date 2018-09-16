package com.example.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloworld")
	public String hello() {
		return "Hello world";
	}

}
