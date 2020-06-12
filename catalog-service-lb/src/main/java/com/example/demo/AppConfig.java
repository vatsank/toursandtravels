package com.example.demo;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.domains.Catalog;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class AppConfig {

	
		@Bean
	public Catalog europe() {
		
		log.info("========="+"Catalog Initialzed");
		return new Catalog(600, "Europe Tour", LocalDate.of(2021,2,14));
		
	}
	
	
	
	
	
}
