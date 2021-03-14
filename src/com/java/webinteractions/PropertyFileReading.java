package com.java.webinteractions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.java.webelements.Utility;

public class PropertyFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(
				"C:\\Users\\lenovo pc\\eclipse-workspace\\SeleniumPractice\\resource\\test.property");
		Properties p = new Properties();
		p.load(fr);
		WebDriver driver=null;
		String browserName = p.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(p.getProperty("url"));
	}

}
