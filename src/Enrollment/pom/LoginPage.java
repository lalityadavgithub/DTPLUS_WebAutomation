package Enrollment.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="textsearch")
	WebElement usernameEle;
	
	@FindBy(id="Password")
	WebElement passwordEle;
	
	@FindBy(id="btnSub")
	WebElement LoginButton;
	
	//String username, String password
	public void loginApplication() throws InterruptedException, IOException {
		
	FileInputStream fs=new FileInputStream("D:\\eclipse-workspace\\git\\automation_code\\DTPLUS_Web\\src\\myData\\data.properties");
		
		Properties p=new Properties();
		p.load(fs);
		String UName=p.getProperty("uName");
		String PWord=p.getProperty("pWord");

		usernameEle.sendKeys(UName);
		passwordEle.sendKeys(PWord);

		Thread.sleep(10000); 
		LoginButton.click();
		

	}
	
	public void Url() throws IOException, InterruptedException {
		
FileInputStream fs=new FileInputStream("D:\\eclipse-workspace\\git\\automation_code\\DTPLUS_Web\\src\\myData\\data.properties");
		
		Properties p=new Properties();
		p.load(fs);
		String UrL=p.getProperty("URL");
		
		driver.get(UrL);


		//driver.get("https://dtpapptestv1.mloyalcapture.com");
	}
	
}
