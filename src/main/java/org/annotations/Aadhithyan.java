package org.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Aadhithyan {
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest - Aadhithyan");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest - Aadhithyan");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass - Aadhithyan");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass - Aadhithyan");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups - Aadhithyan");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups - Aadhithyan");
	}
	@BeforeMethod (groups = "smoke")
	public void beforeMethod() {
		System.out.println("Before Method - Aadhithyan");
	}

	@AfterMethod (groups = "smoke")
	public void afterMethod() {
		System.out.println("After Method - Aadhithyan");
	}

	@Test (groups="smoke")
	public void test1() {
		System.out.println("Test1 - Aadhithyan");
	}

	@Test (groups = "smoke")
	public void test2() {
		System.out.println("Test2 - Aadhithyan");
	}

	@Test
	public void test3() {
		System.out.println("Test3 - Aadhithyan");
	}
}
