package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.dto.BoardDTO;


@Controller
public class Controller6 {
	@GetMapping("/view6")
	public String mainPage(Model model) {
		BoardDTO b1 = new BoardDTO(1,"우리만나 당장만나 따져보세.","kimsunhee");
		BoardDTO b2 = new BoardDTO(2,"우리의 일그러진 영웅은?","이말자"); 
		BoardDTO b3 = new BoardDTO(3,"여름이 왔어 벌써?","김하늘"); 
		BoardDTO b4 = new BoardDTO(4,"휴가는 어디로 갈거니?","왕서방"); 
		BoardDTO b5 = new BoardDTO(5,"에어컨은 언제 켜볼까?","학생회장"); 
		BoardDTO b6 = new BoardDTO(6,"오늘은 과학의날 입니다.","아인슈타인"); 
		List<BoardDTO> blist = new ArrayList<BoardDTO>();
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		blist.add(b4);
		blist.add(b5);
		blist.add(b6);
		model.addAttribute("boardDTO",b1);
		model.addAttribute("blist", blist);
		
		return "/post/view6";
	}
	

}
