package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.TouristGuide;

@Repository
public interface TourGuideRepository extends JpaRepository<TouristGuide, Integer> {

	public TouristGuide findByFirstName(String name);

	  @Query(value = "SELECT * FROM tourguides WHERE first_name = :firstName", nativeQuery = true)
    List<TouristGuide> findGuideByFirstName(@Param("firstName") String firstName);

    @Query("FROM TouristGuide WHERE firstName = :firstName AND lastName = :lastName")
    List<TouristGuide> findByFirstAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

   @Query("UPDATE TouristGuide SET firstName = :prefix || firstName")
   @Modifying
   @Transactional
   void updatePrefix(@Param("prefix") String prefix);

}
