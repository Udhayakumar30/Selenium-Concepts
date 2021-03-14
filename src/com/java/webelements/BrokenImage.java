package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement broke=driver.findElement(By.xpath("//img[@src='../images/home.png']"));

		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));

		if (broke.getAttribute("naturalWidth").equals("0")) {
			System.out.println("broken image");

		} else {
			System.out.println("not an broken image");
		}
	}

}
