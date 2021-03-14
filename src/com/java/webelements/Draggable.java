package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));

		Actions a = new Actions(driver);
		a.clickAndHold(drag).moveByOffset(70, 100).release(drag).build().perform();
		
		
	}

}
