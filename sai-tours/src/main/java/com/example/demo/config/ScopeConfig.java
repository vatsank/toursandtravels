package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.domains.MyPrototype;
import com.example.demo.domains.MyRefinedSingleton;
import com.example.demo.domains.MySingleton;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ScopeConfig {

	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public MySingleton onlyOne() {
		log.info("My Singleton Bean Initialized");
		return new MySingleton();
	}
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public MyRefinedSingleton refOne() {
		log.info("Refined Singleton Bean Initialized");
		return new MyRefinedSingleton();
		}
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MyPrototype many() {
		log.info("====="+"PrototypeBean Intialized");
		return new MyPrototype("ProtoBean");
	}
	
    

}
