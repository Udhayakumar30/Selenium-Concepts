package com.java.webinteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.webelements.Utility;

public class Omayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> multiSelectionBox = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		// multiSelectionBox.get(0).click();

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.click(multiSelectionBox.get(0));
		a.click(multiSelectionBox.get(1));
		a.click(multiSelectionBox.get(2));
		a.click(multiSelectionBox.get(3));
		a.build().perform();

	}

}
