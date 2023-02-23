package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller3 {

	String colour = "Red";
	
	@GetMapping("/3")
	
	public String getColour() {
	
			return "welcome "+colour+" !";
	
	}

}
