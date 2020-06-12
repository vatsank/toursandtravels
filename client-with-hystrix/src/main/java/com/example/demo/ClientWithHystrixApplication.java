package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
public class ClientWithHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientWithHystrixApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
