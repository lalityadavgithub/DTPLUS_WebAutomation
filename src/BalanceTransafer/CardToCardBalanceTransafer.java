package BalanceTransafer;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Enrollments.GenericClass;

public class CardToCardBalanceTransafer extends GenericClass {

	@Test // (priority=1)
	public void LaunchBrowser1() throws InterruptedException, IOException {

		LaunchBrowser();
		Login();

	}
	@Test(priority = 2)
	public void CardToCard() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='19||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='88||2']"))).click().build().perform();
		Thread.sleep(3000);

	}
	@Test(priority = 3)
	public void CardToCardTransfer() throws InterruptedException {
		
		driver.findElement(By.id("custIdVal")).sendKeys("4000000277");
		driver.findElement(By.xpath("//button[@onclick=\'return searchValidations()\']")).click();
		
		WebElement checkbox =driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		
		checkbox.click();
		
		   boolean isSelected = checkbox.isSelected();
	        
	        Thread.sleep(3000);

	        if (isSelected) {
	            System.out.println("The checkbox is selected.");
	        } else {
	            System.out.println("The checkbox is not selected.");
	        }
	
	        
	        WebElement copyElement = driver.findElement(By.id("fromCardNoId_2"));
	        String copiedText = copyElement.getText(); // Get the text to copy

	        // Wait for a moment (optional, for visibility)
	        Thread.sleep(3000);

	        // Paste the copied text into the target element using JavaScript
	        WebElement pasteElement = driver.findElement(By.id("toCardNoId_0"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", pasteElement, copiedText);
	        
	        //
	        driver.findElement(By.id("amtTotransId_0")).sendKeys("1");
	        
	        // Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by a specific pixel offset (e.g., 500 pixels down)
	        js.executeScript("window.scrollBy(0,500)");
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.cssSelector("button[onclick='transferAmount()']")).click();
	
	        System.out.println("clicked");
	       Thread.sleep(3000);
	        driver.findElement(By.cssSelector("button[onclick='transferAmount()']")).click();
	        System.out.println("clicked1");

	
	        Alert alert = driver.switchTo().alert();

	        // Get the text from the alert
	        System.out.println("Alert Text: " + alert.getText());

	        // Accept the alert (click OK)
	        alert.accept();
	        
	        Thread.sleep(3000);
	        System.out.println(driver.findElement(By.id("successUpdate")).getText());
	
	}
}
