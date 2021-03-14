package com.java.webinteractions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;


import com.java.webelements.Utility;

public class WebApplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(options);

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("//li[@class]//a[@title='T-shirts']"));
		a.moveToElement(tshirt).click().build().perform();
	}

}
