package com.simplilearn.test.phase3_Junit5_test_02_21_2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test Run on Windows Operating System")
	@EnabledOnOs({OS.WINDOWS})
	void testRunONWindows() {
		System.out.println("This test only run in windows platform");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on Linux Operating System")
	@EnabledOnOs({OS.LINUX})
	void testRunONLinux() {
		System.out.println("This test only run in Linux platform");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test is Disabled on Linux Operating System")
	@DisabledOnOs({OS.LINUX})
	void testDisableONLinux() {
		System.out.println("This test only disabled in Linux platform");
		assertTrue(true);
	}
	
	
	@Test
	@DisplayName("Test Run on JRE 1.8")
	@EnabledOnJre(JRE.JAVA_8)
	void testRunONJRE8() {
		System.out.println("This test only Run with JRE 1.8");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on JRE 11")
	@EnabledOnJre(JRE.JAVA_11)
	void testRunONJRE11() {
		System.out.println("This test only Run with JRE 11");
		assertTrue(true);
	}

	@Test
	@DisplayName("Test on random number")
	@DisabledIf("Math.random() < 0.31415")
	void testRunONSomeRandomNumber() {
		System.out.println("This may or may not exicute");
		assertTrue(true);
	}
}
