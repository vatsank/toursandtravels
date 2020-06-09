package com.example.demo.domains;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="corpcatalog")
public class CorpCatalog extends Catalog {

	
	private double discount;

	public CorpCatalog(int id, String description, LocalDate releaseDate, double discount) {
		super(id, description, releaseDate);
		this.discount = discount;
	}
	
	
	
}




	