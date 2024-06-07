package Paycode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class GeneratePaycode extends GenericClass {
	
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
	a.moveToElement(driver.findElement(By.xpath("//a[@id='513||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='459||2']"))).click().build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.id("CustomerId")).sendKeys("4000000277");
	driver.findElement(By.id("Amount")).sendKeys("1");
	driver.findElement(By.xpath("//span[normalize-space()='--Select--']")).click();
	driver.findElement(By.xpath("//label[normalize-space()='PTMTESTU05']")).click();
	
	driver.findElement(By.xpath("//span[normalize-space()='Select Product']")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[normalize-space()='DIESEL']")).click();
	
	
	driver.findElement(By.id("btnSubmit")).click();
	
	System.out.println(driver.findElement(By.id("reason")).getText());

}




	
}
