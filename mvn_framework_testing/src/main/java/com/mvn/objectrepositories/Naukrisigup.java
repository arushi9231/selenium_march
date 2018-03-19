package com.mvn.objectrepositories;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.mvn.genericlibraries.Baseclass;
import com.mvn.genericlibraries.Genericmethods;

public class Naukrisigup {

		@FindBy(xpath="//input[@value='Register with us']")
	    WebElement register;
		
		@FindAll
		({
			
			@FindBy(xpath="//button[@title='I am a Fresher']"),
			@FindBy(linkText="I am a Fresher")
		})
		WebElement fresher;
		
		@FindBy(id="fname")
		WebElement firstnm;
		
		@FindBy(id="email")
		WebElement emailid;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement pwd;
		
		@FindBy(xpath="//input[@name='number']")
		WebElement mob;
		
		@FindBy(xpath="//input[@tnmdependent='cityId']")
		WebElement city;
		
		@FindBy(xpath="//div/label[contains(text(),'Current location')]")
		WebElement currentLoc;
		
		@FindBy(xpath="//input[@name='uploadCV']")
		WebElement cv;
	
	public void clickCity()
	
	{
		city.click();
		Genericmethods.mouseHover(city, "Bangalore");
		currentLoc.click();
}
	
	

public void signupnaukri(String fname, String ID, String passwd, String mobileno)
{
	Baseclass.driv.get("https://www.naukri.com/");
	
	register.click();
	fresher.click();
	firstnm.sendKeys(fname);
	emailid.sendKeys(ID);
    
	pwd.sendKeys(passwd);
	mob.sendKeys(mobileno);
	
	cv.click();
	
}

public void resume() throws AWTException
{
	cv.click();
	cv.sendKeys("Resume.pdf");
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
}




}