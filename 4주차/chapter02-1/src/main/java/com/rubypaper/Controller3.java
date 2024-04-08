package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller3 {
	@PostMapping("/post")
	public String post(@RequestParam String mname,
			@RequestParam String mid,
			Model model) {
		model.addAttribute("membername", mname);
		model.addAttribute("memberid", mid);
		
		return "/post/post";
	}
}
