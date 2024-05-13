package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import com.rubypaper.service.BoardService;

@SpringBootTest(properties = {"author.name = Bae Ji-Ho","author.age = 24","author.phone = 010-5408-8917", "author.adress = 1136, Beoman-ro, Geumcheon-gu, Seoul"},classes=BoardService.class)

public class PropertiesTest4 {
	@Autowired
	private Environment env;
	@Test
	void testMethod() {
		//assertTrue(true);
		System.out.println("이름: " + env.getProperty("author.name"));
		System.out.println("나이: " + env.getProperty("author.age"));
		System.out.println("전화번호: " + env.getProperty("author.phone"));
		System.out.println("주소: " + env.getProperty("author.adress"));
		System.out.println("성별: " + env.getProperty("author.gender"));
	}
	
}
