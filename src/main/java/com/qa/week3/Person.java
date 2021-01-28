package com.qa.week3;

public class Person {
	String fname;
	String sname;
	private int age;
	
	//setter
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	//constructor
	public Person(String fname, String sname) {
		this.fname = fname;
		this.sname = sname;
	}
	
	//constructor
	public Person(String fname, String sname, int age) {
		this.fname = fname;
		this.sname = sname;
		this.age = age;
	}
	
	//constructor
	public Person(String fname) {
		super();
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", sname=" + sname + ", age=" + age + "]";
	}
	
	//a static method
	public static void method() {
		System.out.println("static method");
	}
	
	//a non-static method
		public void method2() {
			System.out.println("non-static method");
		}
	
}
