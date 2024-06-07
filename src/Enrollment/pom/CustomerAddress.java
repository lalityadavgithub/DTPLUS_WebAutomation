package Enrollment.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAddress {

	
	WebDriver driver;
	
	public CustomerAddress (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="CommunicationAddress1")
	WebElement address1;
	
	@FindBy(id="CommunicationAddress2")
	WebElement address2;
	
	@FindBy(id="CommunicationCity")
	WebElement city;
	
	@FindBy(id="CommunicationPinCode")
	WebElement pincode;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_CommunicationStateID']//p[contains(@title,'Select State')]//label")
	WebElement State;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_CommunicationStateID open']//label[contains(text(),'ANDHRA PRADESH')]")
	WebElement StateValue;
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_CommunicationDistrictId']//span[contains(text(),'Select District')]")
	WebElement District;
	
	@FindBy(xpath="//label[text()='ANANTHAPUR']")
	WebElement DistrictValue;
	
	
	@FindBy(id="CommunicationMobileNumber")
	WebElement MobileNo;
	
	@FindBy(id="btnGenerateMobileOTP")
	WebElement RequestMobileOTP;
	

	@FindBy(id="CommunicationEmail")
	WebElement Email;
	
	@FindBy(id="btnGenerateEmailOTP")
	WebElement RequestEmailOTP;
	
	@FindBy(id="btnMobileOTPVerify")
	WebElement MobileOTPVerify;
	
	@FindBy(id="btnEmailOTPVerify")
	WebElement EmailOTPVerify;
	
	@FindBy(id ="sameAddressCheck")
	WebElement permanentAddressSameCheckBox;
	
	@FindBy(xpath="//button[@onclick='return showOfficialDetailsOnlineForm()']")
	WebElement NextButton;
	
	
	@FindBy(xpath="//p[contains(text(),'Entered PAN is already existing in DT Plus system,')]")
	WebElement DuplicatePanEle;
	
	@FindBy(xpath="//button[normalize-space()='YES']")
	WebElement YesButton;
	
	@FindBy(id="PanCardRemarks")
	WebElement PanRemark;
	
	@FindBy(id="btnshowregAddress")
	WebElement InfoNextButton;
	
	@FindBy(xpath="//button[@onclick='return showOfficialDetailsOnlineForm()']")
	WebElement AddressNextButton;
	
	public void Addresses(String Adres1, String Adres2,String citi,String pin,String Mno,String Eid) throws InterruptedException {

		address1.sendKeys(Adres1);
		address2.sendKeys(Adres2);
		city.sendKeys(citi);
		pincode.sendKeys(pin);
		State.click();
		StateValue.click();
		
		Thread.sleep(3000);
		
		District.click();
		DistrictValue.click();
		
		MobileNo.sendKeys(Mno);
	
		Thread.sleep(3000);
		RequestMobileOTP.click();
		Thread.sleep(5000);

		@SuppressWarnings("unused")
		String DuplicateMobileNo=driver.findElement(By.id("comm_mobileNumber_error")).getText();
		
		if (DuplicateMobileNo.contains("Mobile No already exists")) {
			
			MobileNo.clear();
			Thread.sleep(3000);

			//for()
			//MobileNo.sendKeys(Mno);
			MobileNo.sendKeys("6000000010");
			//driver.findElement(By.id("CommunicationMobileNumber")).sendKeys("6000000010");
		//	MobileNo.sendKeys("6000000010");
			
		}
	
		
		Thread.sleep(3000);

		RequestMobileOTP.click();
		Thread.sleep(3000);

		RequestMobileOTP.click();


		
		Email.sendKeys(Eid);
		Thread.sleep(3000);
		RequestEmailOTP.click();
		
		Thread.sleep(20000);

		MobileOTPVerify.click();
		EmailOTPVerify.click();
		permanentAddressSameCheckBox.click();
		NextButton.click();
		
		Thread.sleep(3000);


}
	public void DuplicatePan(String remarks) throws InterruptedException {
		
		String SuccessMessage = DuplicatePanEle.getText();
		if (SuccessMessage.contains("Entered PAN is already existing in DT Plus system")) {
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//			WebElement buttonElement =wait.until(ExpectedConditions.visibilityOfElementLocated((By) YesButton));
//			buttonElement.click();
			
			Thread.sleep(3000);
			YesButton.click();
			Thread.sleep(3000);

			PanRemark.sendKeys(remarks);
			InfoNextButton.click();
			AddressNextButton.click();
		}
			


	}
	
}


