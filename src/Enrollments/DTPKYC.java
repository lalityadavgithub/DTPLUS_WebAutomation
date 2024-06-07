package Enrollments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DTPKYC extends GenericClass {
	// WebDriver driver;
	
	
	@Test
	public void KYC() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
	}

	@Test
	public void ProofOfIdentity() {

		driver.findElement(By.xpath("//p[contains(@title,'--Select ID Proof--')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Masked Aadhar Card']")).click();
	}

	@Test
	public void DocumentNumber1() {

		driver.findElement(By.id("IdProofDocumentNo")).sendKeys("DOCadhar01");
	}
	
	@Test
	public void FrontPhoto1() {

		WebElement upload_file = driver.findElement(By.xpath("//input[@id='IdProofFront']"));
		upload_file.sendKeys("C:/Users/lalit.pmloyal/Desktop/Desktop/Screenshot/adhar demo4.png");
	}

	@Test
	public void BackPhoto1() {

		WebElement upload_backfile = driver.findElement(By.xpath("//input[@id='IdProofBack']"));
		upload_backfile.sendKeys("C:/Users/lalit.pmloyal/Desktop/Desktop/Screenshot/adhardemo.png");
	}

	@Test
	public void ProofOfAddress() {

		driver.findElement(By.xpath("//p[contains(@title,'--Select Address Proof--')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Insurance Policy']")).click();
	}

	@Test
	public void DocumentNumber2() {

		driver.findElement(By.id("AddressProofDocumentNo")).sendKeys("Docs8556");
	}

	@Test
	public void FrontPhoto2() {

		WebElement upload_Addressfile = driver.findElement(By.xpath("//input[@id='AddressProofFront']"));
		upload_Addressfile.sendKeys("C:/Users/lalit.pmloyal/Desktop/Desktop/Screenshot/adhardemo2.png");
	}

	@Test
	public void BackPhoto2() throws InterruptedException {

		WebElement upload_Backfile = driver.findElement(By.xpath("//input[@id='AddressProofBack']"));

		upload_Backfile.sendKeys("C:/Users/lalit.pmloyal/Desktop/Desktop/Screenshot/adhardemo3.png");

		driver.findElement(By.id("btnSaveDoc")).click();

		System.out.println(driver
				.findElement(By.xpath("//p[contains(text(),'KYC Documents Uploaded Successfully with Form Numb')]"))
				.getText());

		Thread.sleep(3000);
	}

	@Test
	public void CopyFormNumber() throws InterruptedException {

		String s = driver
				.findElement(By.xpath("//p[contains(text(),'KYC Documents Uploaded Successfully with Form Numb')]"))
				.getText();
		String FN = s.substring(54, 64);
		System.out.println(FN);
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='60||2']"))).click().build().perform();

		Thread.sleep(4000);
		// Paste Form Number
		driver.findElement(By.id("FormNumber")).sendKeys(FN);
	}


}
