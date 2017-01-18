package com.party.hulchul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class PartyHulchulApplication {

	/*@RequestMapping("/")
    String PartyHulchulApplication() {
        return "Hello World!";
    }*/
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PartyHulchulApplication.class, args);
		System.out.println(ctx.getDisplayName());
		System.out.println("This is my first Spring Boot Example");
		
	}
}
