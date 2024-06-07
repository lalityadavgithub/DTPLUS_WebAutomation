package extentReports;

import java.io.IOException;
import extentReports.ExtentListener;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Enrollments.GenericClass;

public class ExtentListener extends GenericClass implements ITestListener{
	ExtentTest test;
	ExtentReports extent =ExtentReporterNG.getReportObject();
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
		
		test=extent.createTest(result.getMethod().getMethodName());
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

	test.fail(result.getThrowable());
	
	try {
	driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	
	}catch (Exception e1) {
		
		e1.printStackTrace();
	}
	
	String filePath=null;
	try {
		
	 filePath=getScreenshot(result.getMethod().getMethodName(),driver);
	}
	catch(IOException e) {
		e.printStackTrace();
		
		
	test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
	}

	}
	@Override
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }


	@Override
	public void onStart(ITestContext context) {
	    // not implemented
	  }

	@Override
	public void onFinish(ITestContext context) {
	    // not implemented
		
		extent.flush();
	  }
	}


