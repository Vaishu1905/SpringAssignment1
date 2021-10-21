package com.te.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreassignment.classes.Animal;
import com.te.springcoreassignment.classes.Pet;

@Configuration

public class PetConfig {
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("dog");
		return pet;
	}

}
