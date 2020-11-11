package org.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shabeer {
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest - Shabeer");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest - Shabeers");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass - Shabeer");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass - Shabeer");
	}

	@BeforeMethod (groups = "smoke")
	public void beforeMethod() {
		System.out.println("Before Method - Shabeer");
	}

	@AfterMethod (groups = "smoke")
	public void afterMethod() {
		System.out.println("After Method - Shabeer");
	}

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Test1 - Shabeer");
	}

	@Test (groups = "smoke")
	public void test2() {
		System.out.println("Test2 - Shabeer");
	}

	@Test
	public void test3() {
		System.out.println("Test3 - Shabeer");
	}
}
