package mvn_framework_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;
import org.testng.annotations.Test;

public class WriteExcel {
	//(String sheet, int row,int cel,String value) t
	@Test
	public void writeex() throws IOException
	
	{
		File f1=new File("/home/tyss/Desktop/DEMONEW.xlsx");
		FileInputStream	fis=new FileInputStream(f1);
		XSSFWorkbook excelsheet=new XSSFWorkbook(fis);
		XSSFSheet sh=excelsheet.getSheet("Sheet1");
		sh.getRow(0).createCell(0).setCellValue("tyss");
//	    Cell cell=	rw.createCell(0);
//	    cell.setCellValue("pass");	
		FileOutputStream fos=new FileOutputStream(f1);
		
	excelsheet.write(fos);
	fos.close();	
	}

}
