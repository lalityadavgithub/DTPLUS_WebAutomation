package GiftVoucher;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class GenerateGiftVoucher  extends GenericClass {
	
	@Test
	public void LaunchBrowser11() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();

	}
	


@Test(priority=2)//--invocationCount=10)
public void AddNewCustomer() throws InterruptedException {
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='514||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='461||2']"))).click().build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='CustomerId']")).sendKeys("4000000072");
	driver.findElement(By.id("NoofPayCode")).sendKeys("1");
	driver.findElement(By.id("Amount")).sendKeys("1205");
	driver.findElement(By.id("Validity")).sendKeys("1");
	
	driver.findElement(By.id("btnSubmit")).click();
	
}

}
