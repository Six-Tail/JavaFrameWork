package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
public class Controller2 {
	//2
	@GetMapping("/user/userparam")
	public String param(@RequestParam ("userid") String uid, 
						@RequestParam("upass")String upw,
						@RequestParam("uemail")String uemail,
						@RequestParam("unumber")String unumber,
						
						Model model) {
		model.addAttribute("userid", uid);
		model.addAttribute("upass",upw);
		model.addAttribute("uemail",uemail);
		model.addAttribute("unumber",unumber);
		return "/user/userparam";
	}
}
	//1
//	@GetMapping("/user/userparam")
//	public String data(Model model) {
//		model.addAttribute("name","kimmaldong");
//		return "/user/data";
//	}
//}
