package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.domains.CorpCatalog;
import com.example.demo.domains.TouristGuide;
import com.example.demo.services.CatalogService;
import com.example.demo.services.TouristGuideService;

@SpringBootApplication
@EnableDiscoveryClient
public class TouristGuideServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristGuideServiceApplication.class, args);
	}

	@Bean
	public TouristGuide defaValue() {
		
		return new TouristGuide();
	}
	
	@Bean
	public CommandLineRunner command() {
	
		
		return new CommandLineRunner() {
			
			@Autowired
			TouristGuideService service;
			
			@Autowired
			CatalogService catservice;
			
			@Override
			public void run(String... args) throws Exception {
				
				service.add(new TouristGuide(102, "Ramesh", "Kumar", 494949));
				service.add(new TouristGuide(103, "Suresh", "Shetty", 597989));

				catservice.add(new CorpCatalog(493,"syne",LocalDate.of(2020, 3, 20),10));
			}
		};
	}

}
