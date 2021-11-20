package com.bridgelabz.greetingapplication.service;

import java.util.List;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAllGreeting();

	void deleteGreetingById(long id);

	void updateGreetingById(Greeting greeting, long id);

}
