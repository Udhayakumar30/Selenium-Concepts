package com.java.testNG;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.java.webelements.Utility;

public class DataProviding {
	WebDriver driver;
	long startTime;
	long endTime;

	@DataProvider(name = "JqueryInput")
	public Object[][] dataInput() {
		Object[][] data = {
				{ "j", "java" }, 
				{ "b", "cobol" }, 
				{ "s", "scala" }
				};
		return data;

	}

	@BeforeSuite
	public void launchBrowser() {
		driver = Utility.initBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		long startTime = System.currentTimeMillis();
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		System.out.println("total time is:" + " " + totalTime);
	}

	@Test(dataProvider = "JqueryInput")
	public void autoComple(String key, String value) throws InterruptedException {
		driver.get("https://jqueryui.com/autocomplete/");

		driver.switchTo().frame(0);

		WebElement auto_id = driver.findElement(By.id("tags"));
		auto_id.click();
		auto_id.sendKeys(key);
		Thread.sleep(1500);
		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("size:" + li.size());

		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			if (ele.getText().trim().equalsIgnoreCase(value)) {
				ele.click();

			}
		}
	}
}