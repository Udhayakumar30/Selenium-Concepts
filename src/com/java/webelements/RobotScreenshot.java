package com.java.webelements;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class RobotScreenshot {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.amazon.in/computers-and-accessories/b/?ie=UTF8&node=976392031&ref_=nav_cs_pc");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(20000);
		Robot robot = new Robot();
		java.awt.Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationFile = new File("D:\\Screenshot\\robo1.png");
	
		ImageIO.write(source, "png", destinationFile);
		
		Thread.sleep(2000);
		WebElement crop = driver.findElement(By.xpath("//img[@alt='Laptop buying guide']"));

		/*BufferedImage bf = ImageIO.read(destinationFile);
		Dimension d = crop.getSize();
		System.out.println(crop.getSize());
		int h = d.height;
		int w = d.width;
		System.out.println(h + " " + w);
		Point p = crop.getLocation();
		int x_axis = p.getX();

		int y_axis = p.getY();
		System.out.println(x_axis + " " + y_axis);
		BufferedImage bf1 = bf.getSubimage(x_axis, y_axis, 261, 251);
		ImageIO.write(bf1, "png", destinationFile);
		FileHandler.copy(destinationFile, new File("D:\\Screenshot\\robo2.png"));
*/
	}

}
