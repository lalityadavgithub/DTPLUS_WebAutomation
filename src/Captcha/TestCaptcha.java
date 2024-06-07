package Captcha;

import Enrollments.BaseTestClass;
import Enrollments.GenericClass;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.Files;
import java.util.Properties;
import org.openqa.selenium.io.FileHandler;

import static java.util.logging.FileHandler.*;

public class TestCaptcha extends BaseTestClass {

@Test
    public void Captcha() throws InterruptedException, TesseractException, IOException {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit.pmloyal\\drivers\\chromedriver-win64\\chromedriver.exe");
            driver=new ChromeDriver();



        driver.get("https://dtpapptestv1.mloyalcapture.com");
      //  Thread.sleep(5000);
        driver.manage().window().maximize();

driver.findElement(By.id("textsearch")).sendKeys("lalitadmin");
        driver.findElement(By.id("Password")).sendKeys("1234");

        System.out.println("TestEngg");

        Thread.sleep(5000);
        WebElement imageElement= driver.findElement(By.id("img-captcha"));

    File src=imageElement.getScreenshotAs(OutputType.FILE);
    String path="D:\\IntelliJ-WorkSpace\\DTPLUS_Web\\reports\\captcha.png";

     FileHandler.copy(src,new File(path));
        Thread.sleep(5000);

        ITesseract image = new Tesseract();
       String str= image.doOCR(new File(path));

        System.out.println("Image captcha");
        System.out.println("Actual captcha" +str);
        str=str.replace("'", "");

    System.out.println("Actual captcha1" +str);


    Thread.sleep(5000);
        String captcha = str.split("uperline")[1].split(" ")[1];

        driver.findElement(By.xpath("//input[@id='CaptchaCode']")).sendKeys(str);

        driver.findElement(By.id("btnSub")).click();

    }//TESSDATA_PREFIX D:\IntelliJ-WorkSpace\DTPLUS_Web\src\testData
}
