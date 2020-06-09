package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.TouristGuide;
import com.example.demo.services.TouristGuideService;

import java.util.*;
@RestController
public class TourGuideController {

	
	@Autowired
	private TouristGuideService service;
	
	
	@GetMapping(path = "/guides")
	public List<TouristGuide> findAll(){
	
		return this.service.findAll();
	}
	
	@PostMapping(path = "/guides")
	public TouristGuide addGuide(@RequestBody TouristGuide entity){
	
		return this.service.add(entity);
	}
	
}
