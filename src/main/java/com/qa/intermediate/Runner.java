package com.qa.intermediate;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	public static Logger LOGGER = LogManager.getLogger(); //instantiate an object of the LOGGER class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		------------------------LAMBDAS----------------------------
//		combining SCANNERS, LOGGERS, GENERICS, INTERFACES & LAMBDAS
		
		Scanner sc = new Scanner(System.in); //instantiate an object of the SCANNER class 
		LOGGER.info("Please enter the current temperature: "); 
		int val = sc.nextInt(); //scan for an integer the user enters
		int change = 0; //initialise 'change' variable
		//'Lam' is an interface which uses 2 generics - the types(must be non-primitives) are declared in <> 
		// lambda section: (parameter1,parameter2) -> { *code* };
		Lam<Integer,Integer> t = (par1, par2) -> {
			par2 = 30 - par1;
			int out = par1 + par2;
			if(par1<30)
				LOGGER.info("Increased temperature by: " + par2);
			else
				LOGGER.info("Decreased temperature by: " + par2);
			LOGGER.info("New temperature is: " + out);
			return par1;//must have return if lambda is working with a block of code
		};
		//No return required if no '{}' used, e.g: (a) -> a+3 
		LOGGER.info("Original temp was: " + t.temp(val, change));//must call the abstract method from the interface to run the lambda expression
		
//		------------------------WRAPPER CLASSES----------------------------
		
		//Non primitive: Integer, Long, String, Double, etc..
		//Primitive: int, long, double, etc...
		
		int primitive = 3; // primitive type - integer
		
		Integer non_prim = 23; // non primitive type - object/class version of integer
		non_prim.longValue(); // can call methods within the Integer class
		
//		------------------------GENERICS----------------------------

		Gen<Integer,String> a = new Gen<Integer,String>(0,"hi");
		System.out.println(a.getXyz()+3);//string
		System.out.println(a.getAbc()+3);//int
		
//		------------------------ENUMS----------------------------

		Colours r = Colours.red;
		System.out.println(r);
		Colours pizza;
		pizza = Colours.SMALL;

//		------------------------LOGGERS----------------------------

		LOGGER.info("info");
		LOGGER.error("ERROR");
		LOGGER.fatal("fatal");
		LOGGER.debug("debug");

//		------------------------EXCEPTIONS----------------------------

		try {
			//trying to do some code
			int[] arr = { 0, 1, 2 };
			System.out.println(arr[5]);
			System.out.println("try");
		} catch (Exception e) {
			//catching errors
			int[] arr = { 0, 1, 2 };

			System.out.println("check bounds");
			System.out.println(arr[2]);

		}finally {
			//will happen regardless of try or catch
			System.out.println("finally");
		}
		
		try {
			int[] arr = { 0, 1, 2 };
			System.out.println(arr[2]);
			System.out.println("try");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
