package org.parallel;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MyTest {
	@BeforeGroups (groups = "reg")
	public void beforegroup() {
		System.out.println("before group");

	}

	@Test(groups = "reg")
	public void tc01() {
		System.out.println("Test Case 1");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}

	@Test(groups = "reg")
	public void tc02() {
		System.out.println("Test Case 2");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}

	@AfterGroups (groups = "aadhi")
	public void aftergroup() {
		System.out.println("Aftergroup");
	}

	@Test
	public void tc03() {
		System.out.println("Test Case 3");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}

	@Test
	public void tc04() {
		System.out.println("Test Case 4");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc05() {
		System.out.println("Test Case 5");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc06() {
		System.out.println("Test Case 6");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
}
