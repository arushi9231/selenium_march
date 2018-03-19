package com.mvn.genericlibraries;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mvn_framework_testing.Signin;

public class Exceldata {
	public static XSSFWorkbook excelsheet;
	


		String path="D:\\Selenium_bdd_project\\mvn_framework_testing\\src\\test\\resources\\testdata.xlsx";
		public String testdata(String sheet, int row,int cel) throws Exception 
		{
	
	//	FileInputStream fis= new FileInputStream("./mvn_framework_testing/src/test/resources/testdata.xlsx");
			FileInputStream	fis=new FileInputStream(path);
		excelsheet=new XSSFWorkbook(fis);
		Sheet sh=excelsheet.getSheet(sheet);
		Row rw=sh.getRow(row);
		
		String username= rw.getCell(cel).getStringCellValue();
		return username ;
	
		
		
		}



	}

