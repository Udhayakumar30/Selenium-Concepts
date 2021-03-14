package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.webelements.Utility;

public class PiorityTest {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = Utility.customBrowser("firefox");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1, enabled = true)
	public void openGoogle() {
		driver.get("http://www.google.com");
	}

	@Test(priority = 2, dependsOnMethods = "openGoogle")
	public void openBing() {
		driver.get("http://www.bing.com");
	}

}
