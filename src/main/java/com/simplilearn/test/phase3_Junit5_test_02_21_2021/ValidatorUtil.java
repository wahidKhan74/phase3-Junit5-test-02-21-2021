package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import java.util.function.BooleanSupplier;

public class ValidatorUtil {

	public boolean validate(int age) {
		if(age>18) {
			return true;
		}
		return false;
	}

	public String combine(String firstName, String lastName) {
		if(firstName != null && lastName !=null) {
			return firstName +" "+ lastName;
		}
		return null;
	}

}
