package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domains.*;
@RestController
public class ImageController {

	@Autowired
	private Image image;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping(path = "/images/{id}")
	public Image getImage(@PathVariable("id") int id) {
		
		image.setDescription(instanceId);
		return image;
	}
}
