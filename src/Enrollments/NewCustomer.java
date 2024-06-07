package Enrollments;

import java.io.IOException;
import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Enrollment.pom.CustomerAddress;
import Enrollment.pom.CustomerBasicInfo;
import Enrollment.pom.CustomerKeyOfficialDetails;
import Enrollment.pom.SuccessMessage;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class NewCustomer extends GenericClass {
	
	DTPKYC u = new DTPKYC();
	String FN;
	NewCard n=new NewCard();
	ValidateNew_Customer v=new ValidateNew_Customer();
	ValidateNew_Card c=new ValidateNew_Card();
	

	
	@Test // (priority=1)
	public void LaunchBrowser1() throws InterruptedException, IOException {
		

		LaunchBrowser();
		Login();


	}

	@Test(priority = 2)
	public void AddNewCustomer() throws InterruptedException {
		
		CustomerBasicInfo menu = new CustomerBasicInfo(driver);
		menu.hoverOverElement();

		WebElement dropdown=driver.findElement(By.xpath(""));

		Select sc=new Select(dropdown);
		List<WebElement> options=sc.getOptions();
		for (WebElement option:options){
			System.out.println(option.getText());
		}
	}

	@Test(priority = 3)
	public void BasicInfo() throws InterruptedException {
		
		CustomerBasicInfo BasicInfoform = new CustomerBasicInfo(driver);
		BasicInfoform.BasicInformation("JIGNESH RAMESHBHAI DESAI", "Lalit", "AGSPD7679J");
		Thread.sleep(3000);
		
		

	}

	@Test(priority = 4)
	public void Address() throws InterruptedException {

		CustomerAddress adrs=new CustomerAddress(driver);
		
		adrs.Addresses("Noida office", "Building d1", "Noida", "100200",
				"6000000022", "lalit.shiv@paytmmloyal.com");
		
	
		
	}
		
											

	@Test(priority = 5)
	public void DUPLICATE_PAN() throws InterruptedException {

		CustomerAddress Dpan=new CustomerAddress(driver);

		Dpan.DuplicatePan("accepted");

		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void KeyOfficialDetails() throws InterruptedException {

		
		CustomerKeyOfficialDetails keyDetails=new CustomerKeyOfficialDetails(driver);
		
		keyDetails.KeyOfficialDetails("Testauto", "lalit.shiv@paytmmloyal.com", "8652671260","Testing method");
		
	}

	@Test(priority = 7)
	public void CopyFormNumber() throws InterruptedException {
		
		SuccessMessage sm=new SuccessMessage(driver);
		sm.Customer_SuccessMessage();
		

	}
	
	@Test(priority = 8)
	public void KycContinue() throws InterruptedException {
		u.KYC();
		u.ProofOfIdentity();
		u.DocumentNumber1();
		u.FrontPhoto1();
		u.BackPhoto1();
		u.ProofOfAddress();
		u.DocumentNumber2();
		u.FrontPhoto2();
		u.BackPhoto2();
		u.CopyFormNumber();
		
		
    }
	@Test(priority = 9)
	public void AddNewCardContinue() throws InterruptedException {
		n.NewCards();
		n.CardPreference();
		n.FeePaymentDetails();
		n.VehicleDetails();
		
	}
//	@Test(priority = 23)
//	public void ValidateNewCustomerCont() throws InterruptedException {
//		v.ValidateNewCustomer();
//	}
//	
//	@Test(priority = 24)
//	public void ValidateNewCardCont() throws InterruptedException {
//		
//		c.ValidateNewCards();
//	}
}


