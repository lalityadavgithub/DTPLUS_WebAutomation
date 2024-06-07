package Enrollment.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerBasicInfo {

	
	WebDriver driver;
	
	public CustomerBasicInfo (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@id='3||2']")
	WebElement CustomerMenu;
	
	@FindBy(xpath="//a[@id='15||2']")
	WebElement EnrollmentMenu;
	
	@FindBy(xpath="//a[@id='58||2']")
	WebElement AddNewCustomer;
	
	@FindBy(id="btnFormNumber")
	WebElement GenerateFormNumber;
	

	@FindBy(xpath="//div[@class='SumoSelect sumo_CustomerTypeID']//span[contains(text(),'Select Customer Type')]")
	WebElement CustomerType;
	
	@FindBy(xpath="//label[normalize-space()='Fleet']")
	WebElement CustomerTypeValue;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_CustomerSubTypeID']")
	WebElement CustomerSubType;
	

	@FindBy(xpath="//label[text()='Truck Fleet']")
	WebElement CustomerSubTypeValue;
	
	@FindBy(xpath="//span[normalize-space()='Select Zonal Office']")
	WebElement ZonalOffice;
	
	@FindBy(xpath="//label[text()='EAST ZONE']")
	WebElement ZonalOfficeValue;
	
	@FindBy(xpath="//span[normalize-space()='Select Regional Office']")
	WebElement RegionalOffice;
	
	@FindBy(xpath="//label[text()='KOLKATA RRO']")
	WebElement RegionalOfficeValue;
	
	@FindBy(xpath="//span[normalize-space()='Select Sales Area']")
	WebElement SalesArea;
	
	
	@FindBy(xpath="//label[text()='Howrah Retail S.A.']")
	WebElement SalesAreaValue;
	
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_TypeOfCustomerID']//span[contains(text(),'Select Customer Type')]")
	WebElement TypeofCustomer;
	
	@FindBy(xpath="//label[normalize-space()='New Customer']")
	WebElement TypeofCustomerValue;
	
	@FindBy(xpath="//span[normalize-space()='Select Tier Of Customer']")
	WebElement TierOfCustomer;
	
	@FindBy(xpath="//label[normalize-space()='1']")
	WebElement TierOfCustomerValue;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_IndividualOrgNameTitle']//span[contains(text(),'Title')]")
	WebElement Title;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_IndividualOrgNameTitle open']//label[contains(text(),'Mr')]")
	WebElement TitleValue;
	
	
	@FindBy(id="IndividualOrgName")
	WebElement OrgName;
	
	@FindBy(id="CustomerNameOnCard")
	WebElement NameOnCard;
	
	
	@FindBy(xpath="//span[normalize-space()='Select Type of Business Entity']")
	WebElement TypeofBusinessEntity;
	
	@FindBy(xpath="//label[normalize-space()='Sole Propreitorship']")
	WebElement TypeofBusinessEntityValue;
	
	@FindBy(id="CustomerIncomeTaxPan")
	WebElement IncomeTaxPAN;
	
	@FindBy(id="btnVerify")
	WebElement PanVerify;
	
	@FindBy(id="btnshowregAddress")
	WebElement InfoNextButton;
	
	
	 public void hoverOverElement() throws InterruptedException {
		 
			Thread.sleep(5000);

	        Actions actions = new Actions(driver);
	        actions.moveToElement(CustomerMenu).build().perform();
	        Thread.sleep(1000);
	
	        actions.moveToElement(EnrollmentMenu).build().perform();
	        Thread.sleep(1000);
	    
	        actions.moveToElement(AddNewCustomer).click().build().perform();
	        Thread.sleep(3000);
	    }
	 public void BasicInformation(String orgname, String CardName,String PanNo) throws InterruptedException {

		 GenerateFormNumber.click();

		 CustomerType.click();
		 CustomerTypeValue.click();
			Thread.sleep(3000);

		 CustomerSubType.click();
		 CustomerSubTypeValue.click();
			Thread.sleep(3000);

		 ZonalOffice.click();
		 ZonalOfficeValue.click();
			Thread.sleep(3000);

		 RegionalOffice.click();
		 RegionalOfficeValue.click();
			Thread.sleep(3000);

		 SalesArea.click();
		 SalesAreaValue.click();
			Thread.sleep(3000);

		 TypeofCustomer.click();
		 TypeofCustomerValue.click();
			Thread.sleep(3000);

		 TierOfCustomer.click();
		 TierOfCustomerValue.click();
			Thread.sleep(3000);

		 Title.click();
		 TitleValue.click();
			Thread.sleep(3000);

		 OrgName.sendKeys(orgname);
		 
		 NameOnCard.sendKeys(CardName);
		 
			Thread.sleep(3000);

		 
		 TypeofBusinessEntity.click();
		 TypeofBusinessEntityValue.click();
			Thread.sleep(3000);

		 
		 IncomeTaxPAN.sendKeys(PanNo);
		 PanVerify.click();
			Thread.sleep(3000);

		 InfoNextButton.click();
		 
		 
		 
		 
	}
}
