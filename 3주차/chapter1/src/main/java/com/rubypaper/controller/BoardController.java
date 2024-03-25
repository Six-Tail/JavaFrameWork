package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	//메소드로 처리함
	public BoardController() {
		System.out.println("======>BoardController 생성");
	}

	// path 요청
	@RequestMapping(value = "/hello")
	public @ResponseBody String hello(String name) {
		return "Call ME " + name;
	}
}
