package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.TouristGuide;
import com.example.demo.repos.TourGuideRepository;

@Service
public class TouristGuideService {

	
	@Autowired
	private TourGuideRepository repo;

	
	public TouristGuide  add(TouristGuide entity) {
		
		return repo.save(entity);
	}

	public List<TouristGuide> findAll(){
		
		return repo.findAll();
	}
	
}
