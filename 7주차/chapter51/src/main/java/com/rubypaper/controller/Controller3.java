package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO;

@Controller
public class Controller3 {
	@PostMapping("/controller3")
	public String userForm(UserDTO userDTO, Model model) {
		model.addAttribute("head","SpringBoot!!!");
		System.out.println(userDTO.getUserName());
		return "/post/view3";
	}
}
