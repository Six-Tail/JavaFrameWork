package com.rubypaper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentController {
	// 요청패스
	@GetMapping("/present")
	public String present() {
		return "최신 휴대폰";
	}
}