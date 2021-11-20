package com.bridgelabz.greetingapplication.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;
import com.bridgelabz.greetingapplication.service.IGreetingService;

@RestController
@RequestMapping("/home")
public class GreetingContoller {
	
	/*
	 * UC - 1
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping(value={"", "/", "/greeting"})
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(),
					String.format(template, name)
				);
	}
	*/
	
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping(value={"", "/", "/greeting"})
	public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName,
	@RequestParam(value = "lastName", defaultValue = "") String lastName) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		return greetingService.addGreeting(user);
	}
	
	
	
}