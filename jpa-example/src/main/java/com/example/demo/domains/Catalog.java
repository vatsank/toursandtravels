package com.example.demo.domains;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

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
@NoArgsConstructor
@Data
@Entity
@Table(name="catalog")
@Inheritance(strategy = InheritanceType.JOINED)
public class Catalog {

	@Id
	 int id;
	 String  description;
	 LocalDate releaseDate;
	


	
}
