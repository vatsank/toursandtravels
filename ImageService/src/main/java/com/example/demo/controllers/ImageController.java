package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domains.*;
@RestController
public class ImageController {

	@Autowired
	private Image image;
	
	@GetMapping(path = "/images/{id}")
	public Image getImage(@PathVariable("id") int id) {
		
		return image;
	}
}
