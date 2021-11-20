package com.bridgelabz.greetingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greetingapplication.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {}