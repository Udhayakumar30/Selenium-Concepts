package com.java.webelements;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.amazon.in/");

		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; //type casting File
		 * sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destination = new File("D:\\pic.png"); FileHandler.copy(sourceFile,
		 * destination);
		 */
		
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		
		ImageIO.write(screen.getImage(), "png",
				new File("C:\\Users\\lenovo pc\\eclipse-workspace\\SeleniumPractice\\resource\\amazon.png"));
		
	}

}
