package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Enrollments.BaseTestClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResetPassword extends BaseTestClass   {

@SuppressWarnings("deprecation")
@Test(priority = 0)
public  void LaunchBrowser() {
		
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dtpapptestv1.mloyalcapture.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		}
	@Test(priority = 1)
	public  void Login() throws InterruptedException {
		driver.findElement(By.id("textsearch")).sendKeys("4000001019");
		driver.findElement(By.id("Password")).sendKeys("46238125");
		
//		String Captcha = driver.findElement(By.xpath("//div[@id='captcha']")).getText();
//		driver.findElement (By.xpath("//input[@id='CaptchaCode']")).sendKeys(Captcha);
		Thread.sleep(15000);
		driver.findElement(By.id("btnSub")).click();
		
		Thread.sleep(3000); 
		
		driver.findElement(By.id("OldPassword")).sendKeys("46238125");
		driver.findElement(By.id("NewPassword")).sendKeys("Test@123");
		
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Verify OTP']")).click();
		
}


	}

