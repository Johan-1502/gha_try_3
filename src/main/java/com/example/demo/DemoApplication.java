package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private int id;
	private int id2;
	private int id3;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
