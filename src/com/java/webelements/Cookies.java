package com.java.webelements;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.customBrowser("chrome");
		driver.get("http://selenium143.blogspot.com/");
		List<WebElement> s=driver.findElements(By.tagName("a"));
		System.out.println(s);
		Set<Cookie> cook=driver.manage().getCookies();
		Iterator<Cookie> itr=cook.iterator();
		while(itr.hasNext()) {
			Cookie cooks=(Cookie) itr.next();
			//String str=cooks.getDomain();
			//System.out.println(str);
			cooks.getExpiry();
			cooks.getName();
			cooks.getPath();
			cooks.getValue();
			
		}
		
	}

}
