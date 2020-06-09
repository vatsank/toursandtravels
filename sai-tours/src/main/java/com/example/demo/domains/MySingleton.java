package com.example.demo.domains;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

@NoArgsConstructor
@Data
public class MySingleton {

	private int id;
	
	
	@Autowired
	private MyPrototype proto;
	
}
