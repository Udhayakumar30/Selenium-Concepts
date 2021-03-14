package com.java.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement dropdownSelect = driver.findElement(By.id("dropdown1"));
		dropdownSelect.click();

		// using sendkeys also select a dropdown
		dropdownSelect.sendKeys("selenium");
		dropdownSelect.click();
		
		// using select class to select a dropdown list
		Select select = new Select(dropdownSelect);
		select.selectByIndex(0);
		select.selectByValue("2");
		select.selectByVisibleText("Loadrunner");
		
		// get size
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
	}

}
