package com.qa.intermediate;

public class Gen <T,S> {

	T abc;
	S xyz;

//	public Gen(T abc) {
//		this.abc = abc;
//	}

	public Gen(T abc, S xyz) {
		super();
		this.abc = abc;
		this.xyz = xyz;
	}

	public S getXyz() {
		return xyz;
	}

	public void setXyz(S xyz) {
		this.xyz = xyz;
	}

	public T getAbc() {
		return abc;
	}

	public void setAbc(T abc) {
		this.abc = abc;
	}
	
}
