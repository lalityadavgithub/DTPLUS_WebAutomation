package Enrollment.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessMessage {

	WebDriver driver;
	
	public SuccessMessage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//div[@class=\"createmessagearea alert alert-success\"]
	}
	@FindBy(xpath="//div[@class=\"createmessagearea alert alert-success\"]")
	WebElement CustomerSuccessMessage;
	
	
	public void Customer_SuccessMessage() throws InterruptedException {
		
		String s=CustomerSuccessMessage.getText();
		String FN=s.substring(54, 64);
		System.out.println(FN);
		Thread.sleep(5000);
		
		Actions b = new Actions(driver);
		b.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		b.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
		Thread.sleep(1000);
		b.moveToElement(driver.findElement(By.xpath("//a[@id='59||2']"))).click().build().perform();

		Thread.sleep(5000);

		driver.findElement(By.id("FormNumber")).sendKeys(FN);

	}
}
