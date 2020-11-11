package org.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {
	public static WebDriver driver;

	public static void set() {
		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir") + "/driver/chromedriver");
		driver = new ChromeDriver();
	}
	public static void set(String browserName) {
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir") + "/driver/chromedriver");
		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/chromedriver");
			driver = new FirefoxDriver();	
		}
		else {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/driver/chromedriver");
			driver = new InternetExplorerDriver();
		}
			
	}

	public static void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void load(String url) {
		driver.get(url);
	}

	public static void fill(WebElement e, String v) {
		e.sendKeys(v);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void quitBrowser() {
		driver.quit();
	}
	public void dropDown(WebElement e, String s) {
		Select o=new Select(e);
		o.selectByVisibleText(s);
	}
	public String getCurl() {
		String cUrl = driver.getCurrentUrl();
		return cUrl;
	}
	public void verifyUrl(String eUrl) {
		Assert.assertEquals("Wrong URL",eUrl,driver.getCurrentUrl());
	}
	public void verifyValue(List<WebElement> e, String value) {
		Assert.assertEquals("Wrong Value",value,e.get(0).getAttribute("value"));
	}
	public void waitFor(String id, int seconds) {
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	
	
	
	
	public void takeScreenshot(String methodName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File dstFile = new File(System.getProperty("user.dir")+"/screenshots/"+methodName+"_failed.png");
		FileUtils.copyFile(srcFile,dstFile);
	}
	
	
	
}
