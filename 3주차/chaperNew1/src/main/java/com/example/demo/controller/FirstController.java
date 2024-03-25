package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
//단순요청
	@GetMapping("/main")
	public String add() {
		return "/main/main";
	}
}
