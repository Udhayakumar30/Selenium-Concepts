package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		WebElement disabled = driver
				.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::input[4]"));
		disabled.click();
		boolean flag = disabled.isEnabled();
		System.out.println(flag);

	}

}
