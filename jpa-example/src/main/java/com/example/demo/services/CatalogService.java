package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.Catalog;
import com.example.demo.domains.CorpCatalog;
import com.example.demo.repos.CatalogRepository;

@Service
public class CatalogService {

	@Autowired
	private CatalogRepository<Catalog> repo;
	

	public Catalog add(Catalog entity) {
		
		return repo.save(entity);
	}
	
	public List<Catalog> findAll(){
		
		return repo.findAll();
	}
}
