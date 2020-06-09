package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.TouristGuide;

@RepositoryRestResource
public interface TourGuideRepository extends JpaRepository<TouristGuide, Integer> {

	public TouristGuide findByFirstName(String name);
}
