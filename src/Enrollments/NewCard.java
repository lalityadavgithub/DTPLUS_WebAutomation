package Enrollments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewCard extends GenericClass {
	
	@Test
	public  void NewCards() throws InterruptedException  {
		
			
			Thread.sleep(3000);
			driver.findElement(By.id("btnSearch")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("NoOfCards")).sendKeys("1");
			Thread.sleep(5000);
			
	}
	
	        @Test
			public void CardPreference() throws InterruptedException {
	        	driver.findElement(By.id("rbtnCard")).click();
				//System.out.println(driver.findElement(By.id("rbtnCard")).isSelected());
			Thread.sleep(2000);
	        }
	        @Test
	        public void FeePaymentDetails() throws InterruptedException {
			
			driver.findElement(By.id("rbtnOnline")).click();
			Thread.sleep(2000);
	        }
	        @Test
	        public void VehicleDetails() throws InterruptedException {
			driver.findElement(By.id("btnAdd")).click();
			
			
			
			driver.findElement(By.id("VechileNo_0")).sendKeys("VEHICL139");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//tbody//tr//td[4]")).click();
			driver.findElement(By.xpath("//option[contains(text(),'HCV')][1]")).click();
			
			driver.findElement(By.id("VehicleMake_0")).sendKeys("Automation");
			driver.findElement(By.id("YearofRegistration_0")).sendKeys("2001");
			driver.findElement(By.id("VehicleNoVerifiedManually")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("btnsubmit")).click();
			
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Customer and Card details saved successfully and p')]")).getText());
			}
}
