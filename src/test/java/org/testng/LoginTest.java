package org.testng;

import org.base.Base;
import org.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Checking the login functionality of facebook");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("Test completed");
	}

	@Test (dataProvider = "credentials")
	public void loginUsingWrongCredentials(String user, String pass) {
		LoginPage lp = new LoginPage();
		fill(lp.getTxtUsername(), user);
		fill(lp.getTxtPassword(), pass);
		click(lp.getBtnLogin());
		Assert.assertTrue(getCurl().equals("login_attempt"));
	}


	@BeforeMethod
	public void beforeMethod() {
		startTime();
		load("https://www.facebook.com/");
	}

	@AfterMethod
	public void afterMethod() {
		endTime();
	}

	@BeforeClass
	public void beforeClass() {
		set();
	}

	@AfterClass
	public void afterClass() {
		quitBrowser();
	}

	@DataProvider
		public static Object[][] credentials(){
		return new Object[][]{
			{"aadhithyan","12345678"},
			{"sasdsdfgfd","asdffgg"},
			{"asdffgfdgf","dfsdsgfd"}
		};
	}
	
	
	
}
