package com.rubypaper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YuhanController {
	// 요청패스
	@GetMapping("/yuhan")
	public String yuhan() {
		return "유한 화이팅!";
	}
}
