package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PostReqDto;

@RestController // <-- JSON 방식으로 응답처리
@RequestMapping("/api2")
public class PostApiController {

	
	// 클라이언트에서 어떤 값을 보낼지 이미 알고 있다.
	// METHOD : POST
	// 시작줄 : http://localhost:8080/api2/post1
	// 클라이언트에서는 데이터를 json 형식으로 보낼 예정 
	@PostMapping("/post1")
	public void post1(@RequestBody Map<String,Object> reqData) {
		reqData.entrySet().forEach(e -> {
			System.out.println("key : " + e.getKey());
			System.out.println("value : " + e.getValue());
			
		});
		
	}
	
	// http://localhost:8080/api2/post2
	@PostMapping("/post2")
	public PostReqDto post2(@RequestBody PostReqDto reqDto) {
		System.out.println(reqDto.getName());
		System.out.println(reqDto.getEmail());
		System.out.println(reqDto.getAge());
		System.out.println(reqDto.getHobby());
		System.out.println(reqDto.getPhoneNumber());
		System.out.println(reqDto.toString());
		
		return reqDto;
	}
	
	
	
}
