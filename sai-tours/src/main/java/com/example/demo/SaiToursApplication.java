package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.domains.Catalog;
import com.example.demo.domains.MyPrototype;
import com.example.demo.domains.MyRefinedSingleton;
import com.example.demo.domains.MySingleton;
import com.example.demo.domains.Tour;
import com.example.demo.domains.TouristGuide;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SaiToursApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = SpringApplication.run(SaiToursApplication.class, args);
	
	  //Tour simlaTour = ctx.getBean(Tour.class);
		
		// TouristGuide guide = ctx.getBean(TouristGuide.class);
		
		// log.info(guide.toString());
		
//		  TouristGuide guide1 = ctx.getBean(TouristGuide.class,"ramesh");
//		  
//		  TouristGuide guide2 = ctx.getBean(TouristGuide.class,"suresh");
//		  
//		  TouristGuide guide3 = (TouristGuide)ctx.getBean("ramesh");


		//  log.info(simlaTour.toString());
		
		// When more than one Bean of same type , access the bean by type and Id
		
//		TouristGuide guide2 = ctx.getBean("ramesh",TouristGuide.class);
//		
//		log.info(guide2.toString());
//	
//		
//		// Using the Alias Name of the Bean to access
//		TouristGuide guide3 = ctx.getBean("toprated",TouristGuide.class);
//
//		log.info(guide3.toString());
//		
//
//		TouristGuide guide4 = (TouristGuide)ctx.getBean("toprated");
//
//		log.info(guide4.toString());
//		
//		Catalog cat = ctx.getBean(Catalog.class);
//		
//		log.info(cat.toString());

		MySingleton one = ctx.getBean(MySingleton.class);
		
		MySingleton two = ctx.getBean(MySingleton.class);
		
		
		System.out.println(ctx.isSingleton("onlyOne"));
		
		
		
		
MyRefinedSingleton  refone = ctx.getBean(MyRefinedSingleton.class);
		
MyRefinedSingleton reftwo = ctx.getBean(MyRefinedSingleton.class);
		
		
		System.out.println("is singleton"+ctx.isSingleton("refOne"));
		
		
		System.out.println("is prototype"+ctx.isPrototype("many"));
		
		System.out.println(refone.getProto().hashCode());
		System.out.println(reftwo.getProto().hashCode());
		
		
		
		
		ctx.close();

	}
	
}
