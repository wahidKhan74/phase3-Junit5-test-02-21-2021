package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionTest {
	
	ValidatorUtil validatorUtil; 
	
	String firstName = "John";
	String lastName = null;
	int age = 35;
	String[] family = {"Mike","David","Marry","William"};
	
	int[] ages = {10,20,30};
	int[] numbers = {10,20,30};
	
	@BeforeEach
	void setUp() throws Exception {
		firstName = "Smith";
//		lastName = "Smith";
		validatorUtil = new ValidatorUtil();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Assetions Example")
	void testForAssertions() {	
		
		assertTrue(true);
		assertFalse(false);
		assertNull(lastName);
		assertNotNull(firstName);
		
		assertTrue(1000>200);
		
		assertEquals(100, 100);
		assertEquals(23.234, 23.234);
		assertEquals("John Smith", "John Smith");
		assertEquals(true,true);
		
		assertArrayEquals(ages, numbers);
		
		assertThrows(RuntimeException.class, ()-> {
			throw new RuntimeException();
		});
	}
	
	@Test
	@DisplayName("Age validator Test for valid input 35")
	void testForAgeValidationForValidLogin() {
		age = 35;
		assertTrue(validatorUtil.validate(age));
	}
	
	@Test
	@DisplayName("Age validator Test for Invalid input 15")
	void testForAgeValidationForInValidLogin() {
		age = 15;
		assertFalse(validatorUtil.validate(age));
	}
	
	@Test
	@DisplayName("FullName validation Positive Test")
	void testForFullName() {
		firstName = "John";
		lastName ="Smith";
		assertNotNull(validatorUtil.combine(firstName,lastName));
		assertEquals("John Smith", validatorUtil.combine(firstName,lastName));
	}
	
	@Test
	@DisplayName("FullName validation Negative Test")
	void testForFullNameNegative() {
		firstName =null;
		lastName =null;
		assertNull(validatorUtil.combine(firstName,lastName));
	}
	
	

}
