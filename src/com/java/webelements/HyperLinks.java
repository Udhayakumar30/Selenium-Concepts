package com.java.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/Link.html");

		WebElement findWhere = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String str = findWhere.getAttribute("href");
		System.out.println(str);

		WebElement verifyBroken = driver.findElement(By.linkText("Verify am I broken?"));
		 verifyBroken.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("broken link");
		}

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

		int size = totalLinks.size();
		System.out.println("total size is:" + size);
		for (WebElement webElement : totalLinks) {
			String s = webElement.getAttribute("href");
			System.out.println(s);

		}
	}

}
