package com.bridgelabz.greetingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.bridgelabz.greetingapplication")
@EnableJpaRepositories("com.bridgelabz.greetingapplication.repository")
public class GreetingapplicationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GreetingapplicationApplication.class, args);
		System.out.println(context.getBean(GreetingapplicationApplication.class));
	}

}
