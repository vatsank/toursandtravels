package com.example.demo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domains.TouristGuide;
import com.example.demo.ifaces.MyRepository;

@Service
public class TouristGuideRepo implements MyRepository<TouristGuide> {

	@Override
	public TouristGuide add(TouristGuide t) {
	
		return t;
	}

	@Override
	public List<TouristGuide> findAll() {
		return Arrays.asList(new TouristGuide(102, "Ramesh", "Kumar", 44949));
	}

	@Override
	public TouristGuide remove(TouristGuide t) {
		return t;
	}

}
