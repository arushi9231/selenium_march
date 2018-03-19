package com.mvn.genericlibraries;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Samplelistener  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult s) {
	
	
		
		String pass=s.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(Baseclass.driv);
		File sfile=ed.getScreenshotAs(OutputType.FILE);
		File dfile=new File("./Screenshot/screenshot pass.png");
		
		try
		{
			FileUtils.copyFile(sfile, dfile);
		}
		catch(Exception e )
		{
			
		}
		Baseclass.logger.log(LogStatus.INFO.PASS,"testcase is passed");
	}

	@Override
	public void onTestFailure(ITestResult t) {
		// TODO Auto-generated method stub
		String failedtest=t.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(Baseclass.driv);
		File srcf=ed.getScreenshotAs(OutputType.FILE);
		File desf=new File("./Screenshot/screenshot failedtest.png");
		try
		{
			FileUtils.copyFile(srcf, desf);
		}
		catch(Exception e)
		{
			
		}
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
