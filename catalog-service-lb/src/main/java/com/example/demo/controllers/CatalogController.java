package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.Catalog;

@RestController
public class CatalogController {

	@Value("${server.port}")
	private int port;

	@Autowired
	private Catalog catalog;
	
	@GetMapping(path = "/cat")
	public Catalog getCatalog() {
		
		catalog.setId(port);
		return catalog;
	}
}
