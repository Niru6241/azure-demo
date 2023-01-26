package com.azure.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/message")
	public String message() {
		return "Congrats! you have deployed your application on to azure!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
