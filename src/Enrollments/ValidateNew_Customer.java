package Enrollments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ValidateNew_Customer extends GenericClass {

	@Test
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();


	}
	@Test
	public void ValidateNewCustomer() throws InterruptedException {
	Thread.sleep(3000); 
	// mouseover
	 Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
    Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='62||2']"))).click().build().perform();
	Thread.sleep(1000);
	
	driver.findElement(By.id("FormNumber")).sendKeys("9000004634");
	driver.findElement(By.id("btnSave")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//tr[@class='odd']//span[@class='rowCardNo'][normalize-space()='Validate']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//div[@id='BasicInformation']//div[2]//button[1]")).click();
	driver.findElement(By.xpath("//button[@onclick='ShowOfficialDetails()']")).click();
	driver.findElement(By.xpath("//button[@onclick='ShowKYCDetails()']")).click();
	
	driver.findElement(By.id("Remarks")).sendKeys("Approved Customer");
	driver.findElement(By.id("btnApprove")).click();
	
System.out.println(driver.findElement(By.xpath("//div[@class='createmessagearea alert alert-success']")).getText());
}

}


