package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import com.rubypaper.service.BoardService;

@SpringBootTest(properties = {"author.name = leesunshin","author.age = 23","author.nation = KOREA"},classes=BoardService.class)

public class PropertiesTest3 {
	@Autowired
	private Environment env;
	@Test
	void testMethod() {
		//assertTrue(true);
		System.out.println("이름: " + env.getProperty("author.name"));
		System.out.println("나이: " + env.getProperty("author.age"));
		System.out.println("국적: " + env.getProperty("author.nation"));
	}
	
}
