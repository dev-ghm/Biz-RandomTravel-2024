package com.callor.travel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.callor.travel.models.UserVO;
import com.callor.travel.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller

// http://localhost:8080/student/user 까지의 요청을 처리할 부분
@RequestMapping(value="/user")
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVO userVO,Model model) {
		
		// console 에 디버그 메시지를 표시하는 method
		log.debug("폼에서 전달받은 데이터 : {}",userVO.toString());
		
		int ret = userService.join(userVO);
		if(ret < 1) {
			model.addAttribute("JOIN_MSG","FAIL");
			return "user/join";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(
			@RequestParam(required = false, defaultValue = "") String error,
			Model model) {
		
		if(error.equalsIgnoreCase("NEED")) {
			model.addAttribute("MSG","로그인이 필요합니다");
		}
		log.debug(model.toString());
		// return user/join 와 같으
		return null;
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(UserVO userVO, HttpSession httpSession) {
		httpSession.setAttribute("USER", userVO);
		return "redirect:/";
	}
	

}
