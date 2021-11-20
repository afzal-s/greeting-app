package com.bridgelabz.greetingapplication.service.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingapplication.model.Greeting;
import com.bridgelabz.greetingapplication.model.User;
import com.bridgelabz.greetingapplication.repository.GreetingRepository;
import com.bridgelabz.greetingapplication.service.IGreetingService;

@Service
public class GreetingServiceImpl implements IGreetingService {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreetingRepository greetingRepository;
	
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty())? "Hello World" :
			user.getFirstName().isEmpty()? user.getFirstName() : user.getLastName().isEmpty()? user.getFirstName() :
			user.getFirstName() + " " + user.getLastName());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message.toString()));
	}

	@Override
	public Greeting getGreetingById(long id) {
		return greetingRepository.findById(id).get();
	}

	@Override
	public List<Greeting> getAllGreeting() {
		return greetingRepository.findAll();
	}

	@Override
	public void deleteGreetingById(long id) {
		greetingRepository.deleteById(id);
	}

	@Override
	public void updateGreetingById(Greeting greeting, long id) {
		Optional<Greeting> findById = greetingRepository.findById(id);
		if (findById.isPresent()) {
			greetingRepository.save(greeting);
		}
	}

	
	
}
