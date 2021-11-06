package com.nasco.demo.members.memebersdemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/info")
	public APIData greeting(@RequestParam(value = "name", defaultValue = "Digital Nasco API") String name) {
		return new APIData(counter.incrementAndGet(), String.format(template, name));
	}
}