package com.java.webelements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FlipKartExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.customBrowser("chrome");
		driver.get("https://www.techlistic.com/p/selenium-assignments.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement crop = driver.findElement(By.xpath("//img[@height='202']"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("arguments[0].scrollIntoView()", crop);
		js.executeScript("window.scrollBy(0,200)");

		/*
		 * Screenshot screenshot = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
		 * .takeScreenshot(driver, crop); Thread.sleep(2000);
		 * ImageIO.write(screenshot.getImage(), "PNG", new
		 * File("D:\\Screenshot\\flipkart.png"));
		 */

		Screenshot sh = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, crop);
		ImageIO.write(sh.getImage(), "png", new File("D:\\Screenshot\\flipkart.png"));

		BufferedImage expecImg = ImageIO.read(new File("D:\\Screenshot\\flipkart.png"));
		BufferedImage actual = sh.getImage();
		
		ImageDiffer diff = new ImageDiffer();
		ImageDiff img = diff.makeDiff(expecImg, actual);

		if (img.hasDiff() == true) {
			System.out.println("images are same");
		} else {
			System.out.println("images are different");
		}

	}

}
