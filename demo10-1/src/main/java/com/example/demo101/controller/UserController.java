package com.example.demo101.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo101.dto.User;

@Controller
public class UserController {

	@GetMapping("/loginPage")
	public String login() {
		return "login.html";
	}
	
	@PostMapping("login-proc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response, User user) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return "redirect:/mypage/infoPage";
	}
	
	// 인증된 사용자만 들어오게 하기
	@GetMapping("/mypage/infoPage")
	public String infoPage(HttpServletRequest request) {
		System.out.println("여기 코드 실행 할려면 로그인을 하세용");
		return "/mypage/myinfo.html";
	}
	

	@PostMapping("/mypage/cart-proc")
	public String cartPage(HttpServletRequest request, HttpServletResponse response, User user) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return "redirect:/mypage/cart.html";
	}
}
