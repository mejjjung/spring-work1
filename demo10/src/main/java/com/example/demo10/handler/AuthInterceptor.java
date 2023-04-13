package com.example.demo10.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

// AuthInterceptor 는 request 요청이 
// 앞에 /auth/**로 요청한 주소에서만 동작 하도록 설계 할 예정
@Component
public class AuthInterceptor implements HandlerInterceptor{

//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		
//		// 세션 여부 확인
//		HttpSession session = request.getSession();
//		Object principal = session.getAttribute("principal");
//		
//		if(principal == null) {
//			System.out.println("인증 안된 사용자");
//			response.sendRedirect("/loginPage");
//			return false;
//		}
//		
//		return true;	
//	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		System.out.println("preHandler 동작 확인!!");
		if(user == null) {
			response.sendRedirect("/loginPage");
			return false;
		}
		return true;
	}
}
