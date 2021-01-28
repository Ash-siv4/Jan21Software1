package com.qa.week3;

import java.util.Scanner;//need to import in order to use the scanner

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ----------------------USING SCANNER----------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);

		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Your name is: " + name);
		
		// ----------------------CALLING CONSTRUCTORS----------------------

		Person.method();//calling the static method

		Person john = new Person("john", "smith");// non-static
		john.method2();//calling the non-static method
		
		System.out.println(john.toString());
		Person bob = new Person("bob", "the builder");
		System.out.println(bob.fname);
		Person niko = new Person("niko", "hi", 3);
		niko.setAge(64);//assigning a value to the variable without using a scanner
		bob.setAge(sc.nextInt());//assigning a value using a scanner
		System.out.println(niko.toString());

		// ----------------------TYPE CASTING----------------------

		// Widening -> larger size, e.g: int to double
		int in = 84;
		double in2Doub = in;
		System.out.println(in2Doub);// 84.0

		// Narrowing -> shorten size, e.g: double to int
		// JAVA ALWAYS ROUNDS DOWN
		double doub = 42.0;
		int doub2Int = (int) doub;
		System.out.println(doub2Int);

		// cast a string to an integer
		String num = "67";
		int val = Integer.parseInt(num);
		String num2 = "47";
		int val2 = Integer.parseInt(num2);
		System.out.println(num + num2);
		System.out.println(val + val2);

	}

}
