package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendAndDeleteInTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.click();
		search.sendKeys("testing");
		//search.clear();
		String str = search.getAttribute("value");
		System.out.println(str);
		
		//search.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		//search.sendKeys(Keys.BACK_SPACE);
		//search.sendKeys(Keys.DELETE);
		
		
		Actions a=new Actions(driver);
		a.doubleClick(search);
		a.sendKeys(Keys.DELETE);
		a.build().perform();
	}

}
