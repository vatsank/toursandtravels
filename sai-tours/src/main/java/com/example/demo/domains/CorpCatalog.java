package com.example.demo.domains;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Data
public class CorpCatalog {

	final int id;
	final String  description;
	final LocalDate releaseDate;
	
	double discount;
	
	
}




	