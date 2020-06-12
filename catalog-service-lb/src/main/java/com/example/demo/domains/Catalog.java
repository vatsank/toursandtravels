package com.example.demo.domains;

import java.time.LocalDate;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Catalog {

	 int id;
	String  description;
	LocalDate releaseDate;
	


	
}
