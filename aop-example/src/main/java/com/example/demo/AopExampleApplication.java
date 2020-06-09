package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.example.demo.domains.TouristGuide;
import com.example.demo.ifaces.MyRepository;
import com.example.demo.services.TouristGuideRepo;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
@SpringBootApplication
@Slf4j
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(AopExampleApplication.class, args);
	
		  TouristGuideRepo repo = ctx.getBean(TouristGuideRepo.class);
		  
		// MyRepository<TouristGuide> repo = ctx.getBean(MyRepository.class);
		 
		     log.info(repo.getClass().toString());
		     
		  List<TouristGuide> list =repo.findAll();
	
		  list.forEach(System.out::println);
		  
		  TouristGuide suresh = ctx.getBean(TouristGuide.class);
		  
		  TouristGuide added = repo.add(suresh);
		  
		  log.info(added.toString());
		  
	}

	@Bean()
	public TouristGuide suresh() {
		
		return new TouristGuide(102, "suresh", "Kumar", 8949594);
		
	}
}
