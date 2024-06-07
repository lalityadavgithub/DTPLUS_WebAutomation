package Enrollment.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerKeyOfficialDetails {
	
	WebDriver driver;
	
	public CustomerKeyOfficialDetails(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[@title=' Title']")
	WebElement title;
	
	@FindBy(xpath="//li[@class='opt']//label[contains(text(),'Mr')]")
	WebElement titleValue;
	
	@FindBy(id="KeyOffFirstName")
	WebElement FirstName;
	
	@FindBy(id="KeyOffEmail")
	WebElement keyEmail;
	
	@FindBy(id="KeyOffMobileNumber")
	WebElement keyMobNo;
	
	@FindBy(id="KeyOffDesignation")
	WebElement keyDesig;
	
	@FindBy(id="btnAdd")
	WebElement btn;
	
	
	public void KeyOfficialDetails (String name,String email, String mob, String kDesignation) {
		
		title.click();
		titleValue.click();
		FirstName.sendKeys(name);
		keyEmail.sendKeys(email);
		keyMobNo.sendKeys(mob);
		keyDesig.sendKeys(kDesignation);
		btn.click();
		
		
	}

}
