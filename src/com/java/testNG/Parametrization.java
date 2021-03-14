package com.java.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.java.webelements.Utility;

public class Parametrization {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = Utility.initBrowser();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Test
	@Parameters({ "skey" })
	public void openGoogle(String key) {
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys(key);
		searchBox.sendKeys(Keys.ENTER);
	}
}
