package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Payment;

@Configuration
public class AppConfig {

	
	@Bean
	public Payment ramesh() {
		
		return new Payment(2748, "Ramesh", 4500);
	}
}
