package Enrollments;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddOn_Cards extends GenericClass  {


public class AddOnCard {


	@Test
	public void AddCard() throws InterruptedException {

	
		Thread.sleep(3000); 
		// mouseover
		 Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
	    Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='66||2']"))).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("CustomerId")).sendKeys("4000000277");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnFormNumber")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("NoOfCards")).sendKeys("1");
		driver.findElement(By.id("rbtnCard")).click();
		driver.findElement(By.id("rbtnOnline")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("VechileNo_0")).sendKeys("TESTVEHI04");
		Thread.sleep(2000);

		driver.findElement(By.id("ddlVehicleType_0")).click();
		driver.findElement(By.xpath("//option[contains(text(),'HCV')][1]")).click();
		driver.findElement(By.id("VehicleMake_0")).sendKeys("Test");
		driver.findElement(By.id("YearofRegistration_0")).sendKeys("2005");
		
		driver.findElement(By.id("VehicleVerifiedManually")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnsubmit")).click();
		
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Add-On Card request placed successfully')]")).getText());
		
		
	}

}
}
