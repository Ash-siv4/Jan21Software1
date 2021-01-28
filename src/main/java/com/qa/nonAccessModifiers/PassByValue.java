package com.qa.nonAccessModifiers;

import java.util.List;

public class PassByValue {
	int a = 3;
	int c = 6;

	public void update(PassByValue b) {
		b.a = b.a + 4;
	}
	
	public void update2(List <String> list) {
		c = c + 4;
	}
}
