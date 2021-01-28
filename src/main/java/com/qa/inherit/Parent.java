package com.qa.inherit;

public class Parent extends GrandParent {
	
	private String eyecolour;

	public String getEyecolour() {
		return eyecolour;
	}

	public void setEyecolour(String eyecolour) {
		this.eyecolour = eyecolour;
	}
	
	public void hello() {
		System.out.println("parent");
	}
	
	public void hair() {
		System.out.println("black");
	}
	
}
