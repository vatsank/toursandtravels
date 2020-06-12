package com.example.demo;

import org.ribbon.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name = "catalog-service-lb",configuration = RibbonConfig.class)

public class CatalogClientLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogClientLbApplication.class, args);
	}
	 @Bean
	 @LoadBalanced
	 public RestTemplate template() {
		 
		 return new RestTemplate();
	 }
}
