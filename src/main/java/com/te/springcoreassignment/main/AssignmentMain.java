package com.te.springcoreassignment.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreassignment.classes.Pet;
import com.te.springcoreassignment.config.AllConfig;

public class AssignmentMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet = (Pet) context.getBean("pet");
		System.out.println();
		pet.getAnimal().eat();
		pet.getAnimal().speak();
		System.out.println();
	}

}
