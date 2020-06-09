package com.example.demo.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.demo.domains.Catalog;
import com.example.demo.domains.Image;
import com.example.demo.domains.Tour;
import com.example.demo.domains.TouristGuide;
import com.example.demo.utils.Profiles;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class AppConfig {

	
	// Factory Method To Be used by IoC Container to create object
	@Bean
	@Profile(Profiles.DEVELOPMENT)
	public TouristGuide ramesh() {
		
		// Constructor DI Used
		return new TouristGuide(101, "Ramesh", "Kumar", 9949494);
		
	}
	
	@Bean(name="toprated")
	@Profile(Profiles.PRODUCTION)
	public TouristGuide suresh() {
		
		// Constructor DI Used
		return new TouristGuide(102, "suresh", "Kumar", 8949594);
		
	}
	
	@Bean
	public Tour simla() {
		
		Tour simlaTour = new Tour();
		
		// Using Setter DI
		simlaTour.setTourId(901);
		simlaTour.setTourName("Simla");
		simlaTour.setAmount(12000);
		
		// Using Bean Reference- For Collaborating Object
		//simlaTour.setGuide(ramesh());
		
		return simlaTour;
	}
	
	// By Using @Lazy at the Factory method we can control Initialization
	@Bean
	public Catalog europe() {
		
		log.info("========="+"Catalog Initialzed");
		return new Catalog(600, "Europe Tour", LocalDate.of(2021,2,14));
		
	}
	
	
	
	@Bean
	@Lazy
	public Image euro() {
		log.info("*****"+"Image Initialzed");
		return new Image(299,"images/europe.jpg");
	}
	
	@Bean
//	@Primary
	public Image euro2() {
		log.info("*****"+"Image Initialzed");
		return new Image(298,"images/europe.png");
	}
	
}
