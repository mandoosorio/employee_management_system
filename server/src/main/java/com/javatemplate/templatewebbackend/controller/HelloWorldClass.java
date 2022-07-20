package com.javatemplate.templatewebbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldClass {
	
	@GetMapping("/sayHello")
	public String sayHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
