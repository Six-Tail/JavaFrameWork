package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVo;

@RestController
public class SecondController {
	@GetMapping("/getBoardList")
	public List<BoardVo> getBoardList() {
		List<BoardVo> boardList = new ArrayList<BoardVo>();
		for (int i = 1; i <= 10; i++) {
			BoardVo board = new BoardVo();
			board.setSeq(1);
			board.setTitle("title");
			board.setWriter("kimmaldong");
			board.setContent("greeting");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
		}
		return boardList;
	}
}
