package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Payment;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class AppConfig {

	
	@Bean
	public Payment ramesh() {
		
		log.info("Payment Bean initialzed");
		return new Payment(2748, "Ramesh", 4500);
	}
}
