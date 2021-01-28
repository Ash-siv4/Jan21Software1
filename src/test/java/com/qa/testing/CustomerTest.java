package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {
	Customer cust = new Customer();

	@BeforeClass
	public static void start() {
		System.out.println("Before Class");
		// setting up connection to a database
	}

	@Before
	public void preTest() {
		System.out.println("Before");
		// initialise a test - set the data
		// int a = 3;
		cust.setFname("winnie");
		cust.setSname("piglet");
	}

	@Test
	public void addTest() {
		System.out.println("Test");
		// testing a method
	}

	@Test
	public void subTest() {
		System.out.println("Test 2");
		// testing a method
	}

	@Test
	public void toStringTest() {
		assertEquals("Customer [fname=winnie, sname=" + cust.getSname() + "]", cust.toString());
		System.out.println("Test 3");
		// testing a method
	}

	@After
	public void postTest() {
		System.out.println("After");
		// clear data
	}

	@AfterClass
	public static void end() {
		System.out.println("After Class");
		// tearing down connection to a database
	}
}
