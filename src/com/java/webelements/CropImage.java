package com.java.webelements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;

public class CropImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss_2");
		WebElement amazon = driver.findElement(By.xpath("//img[@data-image-index='0']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	//	js.executeScript("arguments[0].scrollIntoView()", amazon);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\amazon.png");
		FileHandler.copy(source, destination);
		
		
	

		BufferedImage bf = ImageIO.read(source);
		Dimension d = amazon.getSize();
		int h = d.height;
		int w = d.width;
		
		Point p = amazon.getLocation();
		int x = p.x;
		int y = p.y;

		BufferedImage bfimg = bf.getSubimage(x, y, w, h);
		ImageIO.write(bfimg, "png", source);
		FileHandler.copy(source, new File("D:\\mob.png"));

	}

}
