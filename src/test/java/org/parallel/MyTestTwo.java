package org.parallel;

import org.testng.annotations.Test;

public class MyTestTwo {
	@Test
	public void singleTest() {
		System.out.println("single test");
		System.out.println("Thread no. "+Thread.currentThread().getId());
	}

}
