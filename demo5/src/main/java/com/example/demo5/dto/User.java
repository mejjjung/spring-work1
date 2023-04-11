package com.example.demo5.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 기본 생성자 생성 
@AllArgsConstructor // 전체 생성자
@Builder // 빌더 패턴 
public class User {

	@NotNull
	private String name;
	@Min(10)
	private int age;
	@Email(message = "넌 이메일 형식도 모르니?")
	private String email;
	private String phoneNumber;
}
