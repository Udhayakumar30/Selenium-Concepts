package com.java.webinteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.java.webelements.Utility;

public class OmayoDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		dropdown.click();
		

	}

}
