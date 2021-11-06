package com.nasco.demo.members.memebersdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MemebersDemoApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER=LoggerFactory.getLogger(MemebersDemoApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MemebersDemoApplication.class);
	}
		
	public static void main(String[] args) {
		System.out.println("API Directory: " + System.getProperty("user.dir"));
		SpringApplication.run(MemebersDemoApplication.class, args);
		LOGGER.info("NASCO API started using Spring Boot...");
		LOGGER.debug("NASCO API started using Spring Boot with Dubug on..." + System.getProperty("user.dir"));
	}

}
