package mvn_framework_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mvn.genericlibraries.Baseclass;
import com.mvn.genericlibraries.Exceldata;
import com.mvn.genericlibraries.Fileuploading;
import com.mvn.genericlibraries.Genericmethods;
import com.mvn.objectrepositories.Naukrisigup;

public class Signinnaukri extends Baseclass {

	@Test
	public void signuptonaukri() throws Exception
	{
		Exceldata lib= new Exceldata();
		Naukrisigup nsp=PageFactory.initElements(driv, Naukrisigup.class );

		
String fname=lib.testdata("Sheet2", 0, 0);
String ID=lib.testdata("Sheet2", 1, 1);
String passwd=lib.testdata("Sheet2", 2, 1);
String mobileno=lib.testdata("Sheet2", 3, 1);
//String city=lib.testdata("Sheet2", 4, 1);


//String data=lib.testdata("Sheet2", 5, 1);

		
nsp.signupnaukri(fname, ID, passwd, mobileno);
nsp.clickCity();
nsp.resume();
//Fileuploading.upload("./Resume.pdf");
Genericmethods.waitforthepage();

		
	}
}
