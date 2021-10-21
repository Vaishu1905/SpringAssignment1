package com.te.springcoreassignment.classes;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Pet {
	@Autowired
	private Animal animal;
	private String name;
}
