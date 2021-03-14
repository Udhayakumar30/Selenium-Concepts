package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnSize = column.size();
		System.out.println("total column size is:" + " " + columnSize);

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowSize = row.size();
		System.out.println("total row size is:" + " " + rowSize);

	//	List<WebElement> getProgress = driver
		//		.findElements(By.xpath("//th[normalize-space()='Selenium Learning Details']//following::tr//td[1]"));
		List<WebElement> getProgress = driver.findElements(By.xpath("//td[5]"));

		for (WebElement webElement : getProgress) {
			System.out.println(webElement.getText());
		}

		List<WebElement> rowWise = driver.findElements(By.tagName("tr"));

		Iterator<WebElement> itr = rowWise.iterator();
		while (itr.hasNext()) {
			WebElement webElement = (WebElement) itr.next();
			 System.out.print(" "+webElement.getText());
		}

	}

}
