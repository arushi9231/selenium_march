package mvn_framework_testing;

import org.testng.annotations.Test;

import com.mvn.genericlibraries.CodetoExcel;
import com.mvn.genericlibraries.DataProvider;

public class Demo extends DataProvider
{
	CodetoExcel cd=new CodetoExcel();
	
	@Test//(dataProvider="getData")
	public void sample(String s1) throws Exception
	{
		int row=0;
		int cell=0;
		cd.sendToExcel("Sheet2",row, cell,s1);
		row ++;
		cell ++;
	}
	

}
