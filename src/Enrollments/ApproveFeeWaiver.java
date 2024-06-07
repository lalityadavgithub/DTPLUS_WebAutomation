package Enrollments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ApproveFeeWaiver extends GenericClass {

	WebDriver driver;
	
	
	@Test
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();

		//FeeWaiver();
		

		Thread.sleep(3000);
	}
	
	@Test
	public void FeeWaiver() throws InterruptedException {
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='61||2']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
	}
	
}
