package com.qa.nonAccessModifiers;

public class StaticKey {
	static int a = 42;
	static int b;
	
	static {
		System.out.println("run first");
		b = a *3;
	}
	// fields, methods, blocks, nested classes
	
	
//	static class nested{
//		public static void abc() {
//			System.out.println("abc");
//		}
//	}
//	
//	class notstatic{
//		
//	}
	
	public void out() {
		System.out.println("out");
	}
	
	
}
