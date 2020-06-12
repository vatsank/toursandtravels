package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/api/photos/{id}")
	@HystrixCommand(fallbackMethod = "fallBackInvokePhoto",commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")})
		public String invokePhotoService(@PathVariable("id") int id) {
		
		String baseURL = "http://localhost:2020/photos/";
		return template.getForObject(baseURL+id, String.class);
	}
	
	 public String fallBackInvokePhoto( int id) {
		
		return new  String("{id:0,customerName:guest,imageRef:image/guest.png}");
	}
}
