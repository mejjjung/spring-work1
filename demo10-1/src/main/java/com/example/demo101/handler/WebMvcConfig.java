package com.example.demo101.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Autowired
	private AutoInterceptor autoInterceptor; //DI 처리
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 내가 명시하는 요청 설계 주소에서만 동작하게 하기
		
		registry.addInterceptor(autoInterceptor).addPathPatterns("/mypage/**");
		
	}
}
