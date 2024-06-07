package Enrollments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ValidateNew_Card extends GenericClass {

	@Test
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();


	}

	@Test
	public void ValidateNewCards() throws InterruptedException {
	Thread.sleep(3000); 
	// mouseover
	 Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
    Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
	Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.xpath("//a[@id='64||2']"))).click().build().perform();
	Thread.sleep(1000);
	
	driver.findElement(By.id("FormNumber")).sendKeys("9000004634");
	driver.findElement(By.id("btnSearch")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//a[normalize-space()='Validate']")).click();
	Thread.sleep(3000);

	driver.findElement(By.id("checkAll")).click();
	Thread.sleep(1000);

	driver.findElement(By.id("comments")).sendKeys("Approved Card");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
	Thread.sleep(1000);

	System.out.println(driver.findElement(By.xpath("//div[@id='dvreason']")).getText());


}
}
