package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.domains.CorpCatalog;
import com.example.demo.domains.TouristGuide;
import com.example.demo.services.CatalogService;
import com.example.demo.services.TouristGuideService;

@SpringBootApplication
public class JpaExampleApplication {

	
	
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(JpaExampleApplication.class, args);

		  TouristGuideService service = ctx.getBean(TouristGuideService.class);
		  
            service.findAll().forEach(System.out::println);
	
            CatalogService catservice = ctx.getBean(CatalogService.class);
  		  
            catservice.findAll().forEach(System.out::println);
	
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
