package Enrollments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import Enrollment.pom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericClass extends BaseTestClass  {

@SuppressWarnings("deprecation")
public  void LaunchBrowser() throws InterruptedException, IOException {

	
	FileInputStream fs=new FileInputStream("D:\\eclipse-workspace\\git\\automation_code\\DTPLUS_Web\\src\\myData\\data.properties");
	
	Properties p=new Properties();
	p.load(fs);
	String browserName=p.getProperty("Browser");
	//String PWord=p.getProperty("pWord")
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit.pmloyal\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if (browserName.equals("firefox"))
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit.pmloyal\\drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
			}
	else if (browserName.equals("InternetExplorer"))
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit.pmloyal\\drivers\\IEDriverServer_x64_4.14.0\\IEDriverServer.exe");

    driver=new InternetExplorerDriver();
	}
	
	else if (browserName.equals("Safari"))
	{

    driver=new SafariDriver();
	}
	else
	{
		System.out.println("No browser value given");
	}
		//WebDriverManager.chromedriver().setup();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Explicit Wait
//	WebDriverWait wait = new WebDriverWait(driver,10);
//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someId")));

}
		public  void Login() throws InterruptedException, IOException {

		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.Url();
		loginPage.loginApplication();

		//loginPage.loginApplication("lalitadmin", "1234");


			
		Thread.sleep(10000); 
}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png";
		
	}

			
}

