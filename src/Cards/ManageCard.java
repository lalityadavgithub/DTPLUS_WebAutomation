package Cards;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class ManageCard extends GenericClass {
	
	@Test(priority = 0)
	public void LaunchBrowser11() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();
	}
	


@Test(priority=1)
public void AddNewCustomer() throws InterruptedException {
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='13||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='49||2']"))).click().build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.id("GetCustomerIdValue")).sendKeys("4000000277");
	
	driver.findElement(By.xpath("//button[@onclick='searchCards()']")).click();

Thread.sleep(3000);

//check field contain value & disable

		//right click
	WebElement element1=driver.findElement(By.xpath("//input[@value='LALIT SHIV MOORAT YADAV']"));
		a.contextClick(element1).perform();

	//scrolling with JavascriptExecutor
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,1000)");

	//scrolling with Action class
	WebElement element = driver.findElement(By.xpath("//button[text()='Export to Excel']")); // replace "YourElementId" with the id of the element you want to scroll to
	a.moveToElement(element).perform();
}

}
 
	

