package com.example.demo.domains;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Catalog {

	final int id;
	final String  description;
	final LocalDate releaseDate;
	


	@Autowired
	@Qualifier("euro")
	 Image imageRef;
}
