package com.mvn.genericlibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



public class Genericmethods extends Baseclass{
	
	public static void selectbylinktxt(WebElement wb, String text)
	{
	Select sel=new Select(wb);
	
	sel.selectByVisibleText(text);
			
	}
	
	
	public static void mouseHover(WebElement wb, String data)
	{
		
		Actions act=new Actions(Baseclass.driv);
		act.moveToElement(wb).sendKeys(data).build().perform();
	}
	
	
	public static void childbrowserpopup()
	{
		Set<String> set=driv.getWindowHandles();
		Iterator it=set.iterator();
		String pid=(String) it.next();
		String chid=(String) it.next();
		
		driv.switchTo().window(chid);
		driv.close();
		
	}
	
	
	public static void waitforthepage()
	{
		driv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
