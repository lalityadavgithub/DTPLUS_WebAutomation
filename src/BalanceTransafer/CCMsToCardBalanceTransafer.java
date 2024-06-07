package BalanceTransafer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class CCMsToCardBalanceTransafer extends GenericClass {

	@Test // (priority=1)
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();

	}
	@Test(priority = 2)
	public void CardToCCMS() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='19||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='89||2']"))).click().build().perform();
		Thread.sleep(3000);

	}
	@Test(priority = 3)
	public void CardToCCMSTransfer() throws InterruptedException {
		
		
	}

}
