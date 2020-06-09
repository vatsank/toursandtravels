package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.domains.TouristGuide;
import com.example.demo.services.TouristGuideRepo;
import java.util.*;
@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(AopExampleApplication.class, args);
	
		  TouristGuideRepo repo = ctx.getBean(TouristGuideRepo.class);
		  
		  List<TouristGuide> list =repo.findAll();
	
		  list.forEach(System.out::println);
	}

}
