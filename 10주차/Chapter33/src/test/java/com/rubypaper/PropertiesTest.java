package com.rubypaper;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {
	@Value("${author.name}")
	private String name;
	
	@Value("${author.age}")
	private String age;
	@Test
	void testMethod() {
		//assertTrue(true);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
}
