package CcmsRecharge;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class RechargeCCMS extends GenericClass {
	

	@Test // (priority=1)
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();

	}
	
	@Test(priority = 2)
	public void CCMS() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='389||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='390||2']"))).click().build().perform();
		Thread.sleep(3000);

	}
	
	@Test(priority = 3)
	public void Recharge() throws InterruptedException {
		
		driver.findElement(By.id("customerIdVal")).sendKeys("4000001019");
		driver.findElement(By.id("amountVal")).sendKeys("5000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submitForm\"]/div[3]/div/div/div[2]/input")).click();
		
		driver.findElement(By.id("inlineCheckbox")).click();
		
		driver.findElement(By.id("submitButtonval")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
				
		Thread.sleep(3000);

		
	}
}
