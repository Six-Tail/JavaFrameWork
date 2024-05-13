package com.rubypaper;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class PropertiesTest2 {
//	@Value("${author.name}")
//	private String name;
//	
//	@Value("${author.age}")
//	private String age;
	@Autowired
	private Environment env;
	@Test
	void testMethod() {
		//assertTrue(true);
		System.out.println("이름: " + env.getProperty("author.name"));
		System.out.println("나이: " + env.getProperty("author.age"));
	}
	
}
