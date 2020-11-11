package org.failed;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.base.Base;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenFailed.class)
public class TestFailed extends Base{
	@BeforeClass
	public static void startTest() {
		set();
		load("https://www.facebook.com/");
	}
	@Test
	public void tc001() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc002() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc003() {
		AssertJUnit.assertTrue(false);
	}

	@Test
	public void tc004() {
		AssertJUnit.assertTrue(false);
	}

	@Test
	public void tc005() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc006() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc007() {
		AssertJUnit.assertTrue(false);
	}

	@Test
	public void tc008() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc009() {
		AssertJUnit.assertTrue(true);
	}

	@Test
	public void tc010() {
		AssertJUnit.assertTrue(true);
	}
	@AfterClass
	public static void quit() {
		quitBrowser();
	}
}
