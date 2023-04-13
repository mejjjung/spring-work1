package com.example.demo10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo10.dto.User;

@Controller
public class UserController {

	@GetMapping("/loginPage")
	public String loginPage() {
		return "login.html"; // 내부에서 이동 
	}
	
	/**
	 * 
	 * 인증된 사용자만 들어올 수 있게 막을 예정!
	 * AuthInterceptory 동작 시킬려면 주소 설계를 /auth/**
	 */
	@GetMapping("/auth/infoPage")
	public String infoPage(HttpServletRequest request) {
		// 테스트
		// todo
		// 1. 아래 부분 삭제 예정
		// 2. 인터셉터가 동작 하도록 주소 변경 예정
		
//		HttpSession session = request.getSession();
//		Object principal = session.getAttribute("principal");
//		if(principal == null) {
//			return "redirect:/loginPage";
//		}
		System.out.println("여기 코드 실행 할려면 로그인 해라");
		// 상대 위치 들어왔음 --> 현재 그 시점에서 맞게 설계 
		// 위치에서 상대 경로 찾을 지 절대 경로 찾을지 결정
		
		// --> http:localhost:8080/info.html URL
		// --> http:localhost:8080/auth/info URI
		// redirect <-- 어디까지 갔다 오냐면 (브라우저 까지 돌아 갔다 옴)
		// 새로운 request와 response 객체가 만들어 진다. 
		
		return "/info.html";
	}
	
	@PostMapping("/login-proc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response, User user){
		HttpSession session = request.getSession();
		System.out.println("user: " + user);
		session.setAttribute("user", user);
		return "redirect:/auth/infoPage";
	}
}
