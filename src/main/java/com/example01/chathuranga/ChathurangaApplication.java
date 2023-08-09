package com.example01.chathuranga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ChathurangaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChathurangaApplication.class, args);
	}


	@RequestMapping("/")
	public String Hello(){
		return "Hello hghgj";
	}
}

