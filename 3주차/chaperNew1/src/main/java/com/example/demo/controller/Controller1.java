package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
	@GetMapping("/userinfo")
	public String userinfo() {
		
		return "/user/userinfo";
	}
	//데이타 전달요청
	@GetMapping("/userdata")
	public String userdata(Model model) {//데이터 주머니
		model.addAttribute("name","이름:이순신");
		model.addAttribute("achivement", "이순신장군은 조선시대(선조1567∼1608) 명장 중 한 분으로 임진왜란에서 삼도수군통제사로 수군을 이끌고 한산도 해전과 명량해전, 노량해전을 성공시켜 왜군을 물리치는 공을 세우고 전사하였다.");
		return "/user/userdata";
	}
}
