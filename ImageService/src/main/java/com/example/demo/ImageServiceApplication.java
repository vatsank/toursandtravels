package com.example.demo;
import com.example.demo.domains.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageServiceApplication.class, args);
	}

	
	@Bean
	public Image banner() {
		
		return new Image(101,"images/banner.gif","corporate banner");
	}
}
