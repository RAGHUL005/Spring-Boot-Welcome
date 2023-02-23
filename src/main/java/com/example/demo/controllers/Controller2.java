package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller2 {

	String name = "Raghul";
	
	@GetMapping("/2")
	
	public String getName() {
	
			return "welcome "+name+" !";
	
	}

}
