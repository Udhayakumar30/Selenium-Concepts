package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.customBrowser("firefox");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement facebook=driver.findElement(By.linkText("Facebook"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("window.scrollBy(0,900)");
		
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollIntoView()", facebook);

	}

}
