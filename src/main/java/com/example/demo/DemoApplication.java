package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("am-i-lucky")
	public String myLuckyDay(){
		Random random = new Random();
		return random.nextBoolean() ? "It is your lucky day :D" : "Oh no ! Try again HARDER :)";	
	}

}
