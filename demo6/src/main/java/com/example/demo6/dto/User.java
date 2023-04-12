package com.example.demo6.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	
	@NotEmpty
	@Size(min = 1, max=10)
	private String name;
	
	@Min(1)
	@NotNull
	private Integer age;
	
	
	
	
}
