package com.mvn.genericlibraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;



public class CodetoExcel {
	 
	int row=0;
	
	public  void sendToExcel(String sheet, int row,int cel,String value)
			 throws Exception 
	{
	
	
	FileInputStream	inputfile=new FileInputStream("/home/tyss/Desktop/DEMO_NEW.xlsx");
	XSSFWorkbook excelsheet=new XSSFWorkbook(inputfile);
	Sheet sh=excelsheet.getSheet(sheet);
    Row rows=sh.getRow(row);
    Cell cell=	rows.createCell(cel);
    cell.setCellValue(value);	
	FileOutputStream outputfile=new FileOutputStream("/home/tyss/Desktop/DEMO_NEW.xlsx");
	
    excelsheet.write(outputfile);
    outputfile.close();
    row++;
}

}