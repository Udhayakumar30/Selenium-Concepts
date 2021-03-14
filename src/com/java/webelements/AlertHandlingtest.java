package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.reporters.jq.Main;

public class AlertHandlingtest {

	public static void main(String[] args) {

		WebDriver wd = Utility.customBrowser("firefox");
		CustomListnerTest ct = new CustomListnerTest();
		EventFiringWebDriver driver = new EventFiringWebDriver(wd);
		driver.register(ct);

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertBox.click();

		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

		WebElement promptBox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptBox.click();

		Alert a2 = driver.switchTo().alert();
		a2.sendKeys("udhay");
		a2.accept();
	}
}
