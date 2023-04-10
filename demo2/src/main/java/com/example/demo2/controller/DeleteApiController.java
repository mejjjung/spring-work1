package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class DeleteApiController {

	// METHOD : delete
	// http://localhost:8080/api2/delete/{userId}
	// http://localhost:8080/api2/delete/100?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId,
			@RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	

	// http://localhost:8080/api2/delete2/김미정/27
	@DeleteMapping("/delete2/{name}/{age}")
	public void delete2(@PathVariable String name,
			@PathVariable String age) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
