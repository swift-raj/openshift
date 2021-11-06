package com.nasco.demo.members.memebersdemo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicLong;
//import com.nasco.demo.members.memebersdemo.APIData;
//import com.nasco.demo.members.memebersdemo.APIData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersAPIController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MembersAPIController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/members")
	public MemberData greeting(@RequestParam(value = "name", defaultValue = "Digital Nasco Members API") String name) {
		LOGGER.debug("Request Param: " + name );
		return new MemberData(counter.incrementAndGet(), String.format(template, name));
	}
}