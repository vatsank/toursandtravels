package com.example.demo.feign.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domains.TouristGuide;

@FeignClient(name="tourist-guide-service",fallback = HystrixFallBack.class)
public interface MyTourClient {

	  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/guides")
	   List<TouristGuide> findAll();
}



