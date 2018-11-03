package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringboottestXxxx5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestXxxx5Application.class, args);
	}
	
	@GetMapping("/test")
	public String test(){
		return "test springboot docker";
	}
}
