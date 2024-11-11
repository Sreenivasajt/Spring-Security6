package com.cts.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurity6Application {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(SpringSecurity6Application.class);
		SpringApplication.run(SpringSecurity6Application.class, args);
		log.info("Welcome To Spring Security!!");
	}

}
