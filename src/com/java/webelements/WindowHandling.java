package com.java.webelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://omayo.blogspot.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement seleniumTutorial = driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]"));

		for (int i = 0; i <= 3; i++) {
			seleniumTutorial.click();
		}
		String oldWindow = driver.getWindowHandle();
	

		Set<String> allWindow = driver.getWindowHandles();
		List<String> tabs = new ArrayList<String>(allWindow);
	
		//driver.switchTo().window(tabs.get(3));
		driver.close();
		

	}

}
