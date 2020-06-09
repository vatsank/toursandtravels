package com.example.demo.domains;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {

	// The following three are Dependency of Simple Values
	int tourId;
	String tourName;
	double amount;
	
	//  The Following Dependency is a Collaborating Object
	TouristGuide guide;
}
