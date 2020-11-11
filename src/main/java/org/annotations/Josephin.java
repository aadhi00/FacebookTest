package org.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Josephin {
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest - Josephin");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest - Josephin");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass - Josephin");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass - Josephin");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Josephin");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - Josephin");
	}

	@Test
	public void test1() {
		System.out.println("Test1 - Josephin");
	}

	@Test
	public void test2() {
		System.out.println("Test2 - Josephin");
	}

	@Test
	public void test3() {
		System.out.println("Test3 - Josephin");
	}

}
