package Login;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import Enrollments.BaseTestClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.TestNGAntTask.Mode.junit;


public class LoginCredential extends BaseTestClass  {
	

	@Test(priority = 0)
	public  void LaunchBrowser() {

		//WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lalit.pmloyal\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

        int rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		int columnCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();

		System.out.println("row count is: "+ rowCount);
		System.out.println("column count is: "+ columnCount);

		for(int i=0;i<rowCount; i++){
			for(int j=0; j<columnCount; j++){
				String actValue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();

				if (actValue.equals("Francisco Chang")){
					System.out.println(i+" : "+j);
					break;
				}
			}
		}

		}

	}
	





		
	



