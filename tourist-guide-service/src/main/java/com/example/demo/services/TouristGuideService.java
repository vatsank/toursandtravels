package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.TouristGuide;
import com.example.demo.repos.TourGuideRepository;

@Service
public class TouristGuideService {

	@Autowired
	private TouristGuide guide;
	
	@Autowired
	private TourGuideRepository repo;

	
	public TouristGuide  add(TouristGuide entity) {
		
		return repo.save(entity);
	}

    public TouristGuide  update(TouristGuide entity) {
		
		return repo.save(entity);
	}
	public List<TouristGuide> findAll(){
		
		return repo.findAll();
	}
	
	public TouristGuide findById(Integer id) {
		
		TouristGuide found = guide;
		Optional<TouristGuide> resp =repo.findById(id);
		
		if(resp.isPresent()) {
			found = resp.get();
		}
		
		return found;
	}
	
	
}
