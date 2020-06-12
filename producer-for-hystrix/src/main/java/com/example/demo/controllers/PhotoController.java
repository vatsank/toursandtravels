package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProfilePhoto;

@RestController
public class PhotoController {

	@Autowired
	private ProfilePhoto entity;
	
	@GetMapping(path = "/photos/{id}")
	public ProfilePhoto getPhoto(@PathVariable("id") int id) throws InterruptedException {
		
		if(id<5) {
			entity.setId(2020);
			entity.setCustomerName("Ramesh");
			entity.setImageRef("image/ramesh.png");
		} else {
			
			Thread.sleep(10000);
			entity.setId(1111);
			entity.setCustomerName("customer");
			entity.setImageRef("image/avatar.png");
		}
		
		return entity;
	}
}
