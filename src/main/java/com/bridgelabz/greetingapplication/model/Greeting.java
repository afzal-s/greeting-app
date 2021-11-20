package com.bridgelabz.greetingapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public class Greeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final String content;

	public Greeting() {
		this.id = 0;
		this.content = "";
	}
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}


	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
