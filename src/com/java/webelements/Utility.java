package com.java.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility {

	public static WebDriver initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver customBrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Downloads\\Internet Explorer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;

	}
}
