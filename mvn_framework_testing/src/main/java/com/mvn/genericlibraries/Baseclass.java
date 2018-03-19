package com.mvn.genericlibraries;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Baseclass {
	int row=1;
	public static WebDriver driv;
	public ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void initialise()
	{
		String path="./reports/extntreport.html";
		extent=new ExtentReports(path);
	}
		
	
	@BeforeTest
	public void launch()
	{
	driv=new FirefoxDriver();
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}

	@BeforeMethod
	public void configBm(Method m) throws Exception, IOException
	{ 
		String name=m.getName();
		logger=extent.startTest(name);
	}
		
	
	
	
	@AfterMethod
	public void configam(ITestResult t)
	{
		int status=t.getStatus();
	     if(status==1)
		{
			logger.log(LogStatus.PASS, "testcase is pass");
		}
		else{
			logger.log(LogStatus.FAIL, "testcase is fail");
		}
    extent.endTest(logger);                                                                                        
	}
	
	@AfterTest
	public void close()
	{
		
	}
	
	@AfterSuite
	public void end()
	{
		extent.flush();
	}
}
