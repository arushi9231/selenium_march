package com.mvn.objectrepositories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvn.genericlibraries.Baseclass;

public class Signuppage extends Baseclass{
	
	@FindBy(id="createacc")
	 WebElement signup;
	
	@FindBy(id="usernamereg-firstName")
	WebElement fname;
	
	@FindBy(id="usernamereg-lastName")
	WebElement lname;
	
	@FindBy(id="usernamereg-yid")
	WebElement yid;
	@FindBy(id="usernamereg-password")
	WebElement pwd;
	
	@FindBy(id="usernamereg-phone")
	WebElement mobno;
	
	@FindBy(id="usernamereg-month")
	WebElement month;
	
	@FindBy(id="usernamereg-day")
	WebElement day;
	
	@FindBy(id="usernamereg-year")
	WebElement year;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement done;
	
	
	public void signin(String firstn, String lastn, String emailid, String password,
			String phoneno, String Day, String Year)
	{
		
		
		driv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		signup.click();
		fname.sendKeys(firstn);
		lname.sendKeys(lastn);
		yid.sendKeys(emailid);
		pwd.sendKeys(password);
		mobno.sendKeys(phoneno);
		month.click();
		day.sendKeys(Day);
		year.sendKeys(Year);
		done.click();
	}
  public Signuppage(WebDriver driv){
	  
	  
	  this.driv=driv;
	  
	  PageFactory.initElements(driv, this);
	  
	  
	  
  }
}
