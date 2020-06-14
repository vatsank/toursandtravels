package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.TouristGuide;
import com.example.demo.feign.clients.MyTourClient;
import java.util.*;
@RestController
public class FeignClientController {

	@Autowired
	private MyTourClient client;
	
	@GetMapping(path="/guides")
	public List<TouristGuide> findAll(){
		
		return client.findAll();
	}
}
