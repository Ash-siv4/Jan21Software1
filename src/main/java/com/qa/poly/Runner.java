package com.qa.poly;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Animal b = new Cat();
		Dog c = new Dog();
		c.speak(3);
		c.speak();
		c.speak(0, 0);

		
		
		
		
		a.speak();
		b.speak();
		
	}

}
