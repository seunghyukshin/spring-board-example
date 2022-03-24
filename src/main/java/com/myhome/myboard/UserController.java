package com.myhome.myboard;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myhome.myboard.dto.UserDto;
import com.myhome.myboard.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String login(UserDto userDto, HttpSession session) {
		userDto = userService.login(userDto);
		session.setAttribute("userinfo", userDto);
		return "index";
	}

}
