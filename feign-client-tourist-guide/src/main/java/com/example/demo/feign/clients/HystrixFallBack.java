package com.example.demo.feign.clients;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.domains.TouristGuide;

@Component
public class HystrixFallBack implements MyTourClient{

	@Override
	public List<TouristGuide> findAll() {
		return Arrays.asList(new TouristGuide(000, "guest", "guest", 1111));
	}

	
}
