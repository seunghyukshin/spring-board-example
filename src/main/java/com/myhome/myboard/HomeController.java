package com.myhome.myboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		// view만 리턴
		return "index";
	}

	@RequestMapping("/hello.do")
	public ModelAndView hello(String name) {
		// 데이터도 같이 return

		ModelAndView mav = new ModelAndView();

		// request.setAttribute();
		mav.addObject("msg", "Hello " + name);
		mav.setViewName("hello/hellomsg"); // WEB-INF/views/hellomsg.jsp
		return mav;
	}
}
