package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackRoundColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();

		WebElement getPosition = driver.findElement(By.id("position"));
		Point p = getPosition.getLocation();
		int xvalue=p.getX();
		int yvalue=p.getY();
		System.out.println(xvalue+" "+yvalue);
		
		WebElement colour=driver.findElement(By.id("color"));
		String str=colour.getCssValue("background-color");
		System.out.println(str); 
	}

}
 