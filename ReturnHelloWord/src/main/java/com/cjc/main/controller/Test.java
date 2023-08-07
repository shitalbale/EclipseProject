package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	
	@GetMapping("/m1")
	public String m1() {
		return "Akshay";
		
	}

}
