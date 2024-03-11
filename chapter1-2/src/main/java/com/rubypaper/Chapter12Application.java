package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter12Application {

	public static void main(String[] args) {
		// SpringApplication.run(Chapter12Application.class, args);

		SpringApplication application = 
				new SpringApplication(Chapter12Application.class);
		application.run(args);
		System.out.println("유한대학교 3-1반 스프링부트");
	}

}
