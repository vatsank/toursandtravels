package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.TouristGuide;
import com.example.demo.services.TouristGuideService;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class TourGuideController {

	
	@Autowired
	private TouristGuideService service;
	
	
	@GetMapping(path = "/guides")
	public List<TouristGuide> findAll() throws InterruptedException{
	
		log.info("Tourist Controller Find all called");
		return this.service.findAll();
	}
	
	@GetMapping(path = "/guides/{id}")
	public TouristGuide findById(@PathVariable("id") int id){
	
		return this.service.findById(id);
	}
	
	
	@PostMapping(path = "/guides")
	public TouristGuide addGuide(@RequestBody TouristGuide entity,
			              HttpServletResponse resp){
	
		resp.setStatus(201);
		return this.service.add(entity);
	}
	
	@PutMapping(path = "/guides")
	public TouristGuide updateGuide(@RequestBody TouristGuide entity){
	
		return this.service.update(entity);
	}
}
