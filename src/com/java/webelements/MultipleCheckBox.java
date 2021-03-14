package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultipleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		//checkBox.get(0).click();
		//checkBox.get(1).click();

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.click(checkBox.get(2));
		a.build().perform();
		
	//	a.clickAndHold(checkBox.get(3)).build().perform();

		Iterator<WebElement> itr = checkBox.iterator();
		while (itr.hasNext()) {
			WebElement element = (WebElement) itr.next();
			System.out.println(element);
		}
	}

}
