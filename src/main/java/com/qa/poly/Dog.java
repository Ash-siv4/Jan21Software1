package com.qa.poly;

public class Dog extends Animal{
	
	public void speak() {
		 System.out.println("woof");
	 }
	
	
	public int speak(int age) {
		 System.out.println("woof");
		 return age*3;
	 }
	
	public int speak(int age, int size) {
		 System.out.println("woof");
		 return age*size;
	 }
	
}
