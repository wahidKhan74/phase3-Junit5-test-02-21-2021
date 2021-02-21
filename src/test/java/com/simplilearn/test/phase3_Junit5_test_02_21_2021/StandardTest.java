package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Standard with Annotation.")
public class StandardTest {

		@BeforeEach
		void setUpForEachTest() {
			System.out.println("---- Before Each Test ! ------");
		}
		
		@Test
		@DisplayName("First Sample Test")
		@Tag("Dev")
		public void test1Call(){
			System.out.println("---- This is a test 1 Call -------");
		}
		
		@Test
		@DisplayName("Third Sample Test")
		@Disabled
		public void test3Call(){
			System.out.println("---- This is a test 1 Call -------");
			fail("This is a failure test.");
		}
		
		@AfterEach
		void tearDown() {
			System.out.println("---- After Each Test ! ---- ");
		}
		
		@Test
		@DisplayName("Second Sample Test")
		public void test2Call(){
			System.out.println("---- This is a test 2 Call -------");
		}
		
		@BeforeAll
		static void setUpAll() {
			System.out.println("---- Before ALL Test ! ------");
		}
		
		@AfterAll
		static void tearAll() {
			System.out.println("---- After ALL Test ! ------");
		}
}
