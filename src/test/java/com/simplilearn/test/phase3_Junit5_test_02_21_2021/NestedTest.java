package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class NestedTest {
	
	App app;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("-- Before Each -- ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("-- After Each -- ");
	}

	@Test
	@RepeatedTest(value=3)
	void test() {
		System.out.println("-- Main Test  -- ");
		assertTrue(true);
	}
	
	@Nested
	@DisplayName("Test :: Additions")
	class AdditionNestedTest {
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("-- Before Each Nested-- ");
			app= new App();
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("-- After Each Nested -- ");
		}
		
		@Test
		@DisplayName("Test Positive value")
		void testPositiveNumber() {
			assertEquals(100, app.add(50, 50));
			assertEquals(200, app.add(150, 50));
			assertEquals(400, app.add(250, 150));
		}
		
		@Test
		@DisplayName("Test Negative value")
		void testNegativeNumber() {
			assertEquals(0, app.add(-50, 50));
			assertEquals(-100, app.add(-150, 50));
			assertEquals(100, app.add(250, -150));
		}
	}
	
	
	@Nested
	@DisplayName("Test :: Substractions")
	class SubstrationNestedTest {
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("-- Before Each Nested-- ");
			app= new App();
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("-- After Each Nested -- ");
		}
		
		@Test
		@DisplayName("Test Positive value")
		void testPositiveNumber() {
			assertEquals(0, app.sub(50, 50));
			assertEquals(100, app.sub(150, 50));
			assertEquals(100, app.sub(250, 150));
		}
		
		@Test
		@DisplayName("Test Negative value")
		void testNegativeNumber() {
			assertEquals(0, app.sub(-50, 50));
			assertEquals(200, app.sub(150, -50));
			assertEquals(400, app.sub(250, -150));
		}
	}

}
