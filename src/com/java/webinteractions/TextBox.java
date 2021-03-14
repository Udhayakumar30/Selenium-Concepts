package com.java.webinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.webelements.Utility;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://omayo.blogspot.com/");
		WebElement textBox = driver.findElement(By.xpath("//textarea[@cols='30']"));
		textBox.click();

		String s = textBox.getAttribute("value");
		System.out.println(s);
		textBox.clear();
		
		
	}

}
