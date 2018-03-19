package mvn_framework_testing;

import org.apache.poi.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mvn.genericlibraries.Baseclass;
import com.mvn.genericlibraries.Exceldata;
import com.mvn.objectrepositories.Signuppage;

@Listeners(com.mvn.genericlibraries.Samplelistener.class)


public class Signin extends Baseclass  {
	
	@Test
	public void registeryahoo() throws Exception 
	{
	Exceldata lib=new Exceldata();
	driv.get("https://login.yahoo.com/");
	//Signuppage sign=PageFactory.initElements( Baseclass.driv,Signuppage.class );
    Signuppage sign=new Signuppage(Baseclass.driv);

    String first=lib.testdata("Sheet1", 0, 0);
	String lastn=lib.testdata("Sheet1", 0, 1);
	
	
	String emailid = lib.testdata("Sheet1", 1, 1);
	String password=lib.testdata("Sheet1", 2, 1);
	String phoneno=lib.testdata("Sheet1", 3, 1);
	String Day=lib.testdata("Sheet1", 4, 1);
	String Year=lib.testdata("Sheet1", 4, 3);
	sign.signin(first, lastn, emailid, password, phoneno, Day, Year);
	
	
			
			
	}
}
