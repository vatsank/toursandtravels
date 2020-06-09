package com.example.demo.domains;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@Data
public class MyPrototype {

	String name;
	
	public int hashCode() {
		
		return super.hashCode();
	}
}
