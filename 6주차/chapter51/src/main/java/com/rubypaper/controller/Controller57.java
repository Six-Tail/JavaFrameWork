package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.BookDTO;
@Controller
public class Controller57 {
	@GetMapping("/form57")
	public String getmain() {
		
		return "/post/form57";
	}
	@PostMapping("/view57") //객체달고 넘김
	public String postmain(BookDTO bookDTO, Model model) {
		model.addAttribute("heading","도서정보 전달");
		return "/post/view57";
	}
}
