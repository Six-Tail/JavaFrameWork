package com.rubypaper.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVo;

@RestController
public class SecondController {
	@GetMapping("/getBoard")
	public BoardVo getBoard() {
		BoardVo board = new BoardVo();
		board.setSeq(1);
		board.setTitle("title");
		board.setWriter("kimmaldong");
		board.setContent("greeting");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
	}
}
