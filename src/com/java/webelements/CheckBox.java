package com.java.webelements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		List<WebElement> radioGroup = driver.findElements(By.xpath("//label"));
		radioGroup.get(0).click();
		radioGroup.get(3).click();
		radioGroup.get(4).click();
		

		

		Iterator<WebElement> itr = radioGroup.iterator();
		while (itr.hasNext()) {
			WebElement all = (WebElement) itr.next();
			System.out.println(all.getText());
		}

	}

}
