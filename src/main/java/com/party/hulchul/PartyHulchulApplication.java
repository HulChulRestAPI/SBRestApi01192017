package com.party.hulchul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@EnableCaching
public class PartyHulchulApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PartyHulchulApplication.class, args);
		System.out.println(ctx.getDisplayName());
	}
	
}
