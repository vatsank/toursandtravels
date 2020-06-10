package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domains.TouristGuide;

@RepositoryRestResource(path = "agents")
public interface TourHateos extends JpaRepository<TouristGuide, Integer> {

}
