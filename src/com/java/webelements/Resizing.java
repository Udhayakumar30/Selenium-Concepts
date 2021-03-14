package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement resize = driver.findElement(By.xpath("//div[@style='z-index: 90;']/following::div[2]"));
		Thread.sleep(1500);
		Actions a = new Actions(driver);
		a.clickAndHold(resize).moveByOffset(100, 70).release(resize).build().perform();
	}

}
