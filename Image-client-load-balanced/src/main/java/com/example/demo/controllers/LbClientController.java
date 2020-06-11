package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LbClientController {

	@Autowired
	public RestTemplate template;
	
	@Autowired
	public LoadBalancerClient client;
	
	
	@GetMapping(path = "/imgclient")
	public String getImages() {
		
		ServiceInstance instance = client.choose("IMAGE-SERVICE");
		
		String baseUrl = instance.getUri().toString();
		
		String requestURL = baseUrl+"/api/v1/images/1";
		
		String response = template.getForObject(requestURL, String.class);
		
		return response;
	}
}
