package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Basic Test")
class ApplicationTest {
	
	App app;
	
	@BeforeEach
	void setUp() {
		// Instantiate App class
		app = new App();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Addition Test for positive numbers : should return 100 + 200 = 300")
	void testAddForPositive() {
		int result = app.add(100, 200);
		int expected = 300;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Addition Test for negative numbers : should return 100 +(-200) = -100")
	void testAddForNegatives() {
		int result = app.add(100, -200);
		int expected = -100;
		assertEquals(expected, result);
	}
	
	
	@Test
	@DisplayName("Substration Test for positive numbers : should return 100 - 50  = 50")
	void testSubstrationForPositive() {
		int result = app.sub(100,50 );
		int expected = 50;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Substration Test for positive numbers : should return 50 - 100  = 0")
	void testSubstrationForPositive2() {
		int result = app.sub(50,100 );
		int expected = 0;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Substration Test for Zero numbers : should return 0 - 100  = 0")
	void testSubstrationForZeroValue() {
		int result = app.sub(0,100 );
		int expected = 0;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("Substration Test for First Negative numbers : should return -100 - 100  = 0")
	void testSubstrationForFirstNegavtiveValue() {
		int result = app.sub(-100,100 );
		int expected = 0;
		assertEquals(expected, result);
	}

}
