package org.parallel;

import org.base.Base;
import org.testng.annotations.Test;

public class MyTestOne extends Base{
	
	@Test(parameters = {"browserName"})
	public void tc11(String browserName) {
		set(browserName);
		load("https://www.facebook.com");
		System.out.println("Test Case 11");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc12() {
		System.out.println("Test Case 12");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc13() {
		System.out.println("Test Case 13");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc14() {
		System.out.println("Test Case 14");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
	@Test
	public void tc15() {
		System.out.println("Test Case 15");
		System.out.println("Thread status: "+Thread.currentThread().getState());
		System.out.println("Thread no. is "+Thread.currentThread().getId());
	}
}
