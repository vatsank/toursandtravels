package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProducerForHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerForHystrixApplication.class, args);
	}

	@Bean
	public ProfilePhoto photo() {
		
		return new ProfilePhoto();
	}
}
