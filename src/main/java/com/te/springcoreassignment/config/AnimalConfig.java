package com.te.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreassignment.classes.Animal;
import com.te.springcoreassignment.classes.Cat;
import com.te.springcoreassignment.classes.Dog;

@Configuration
public class AnimalConfig {
	@Bean("dog")
	
	public Animal getDog() {
		Animal animal = new Dog();
		return new Dog();
		
	}
	@Bean("cat")
	@Primary
	public Animal getCat() {
		Animal animal = new Cat();
		return new Cat();
	}

}
