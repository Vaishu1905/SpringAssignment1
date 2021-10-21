package com.te.springcoreassignment.classes;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat is drinking milk!!");
		
	}

	@Override
	public void speak() {
		System.out.println("Cat is speaking meow meow");
		
	}

}
