package com.example.greens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	// http://localhost:8080/green
	@GetMapping({"/","green"})
	public String userPage() {
		return "green";
	}
	
	
	
}
