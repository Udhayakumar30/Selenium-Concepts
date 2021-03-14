import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.webelements.Utility;

public class GmailComposeMail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement compose_Mail = driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
		Actions act = new Actions(driver);
		act.moveToElement(compose_Mail).click().build().perform();
		Thread.sleep(3000);
		WebElement To_id = driver.findElement(By.id(":pa"));
		To_id.click();
		To_id.sendKeys("abcd@gmail.com");
		Thread.sleep(3000);
		WebElement subject_id = driver.findElement(By.id(":os"));
		subject_id.click();
		subject_id.sendKeys("hello user");
		Thread.sleep(3000);
		WebElement message_id = driver.findElement(By.id(":px"));
		message_id.click();
		message_id.sendKeys("check this mail");

	}

}
