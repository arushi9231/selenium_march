package com.mvn.genericlibraries;



public class DataProvider {

	@org.testng.annotations.DataProvider

	public Object[][] getData()
	{
		Object[][] obj=new Object[10][1];
		
		obj[0][0]="true";
		obj[1][0]="false";
		obj[2][0]="true";
		obj[3][0]="false";
		obj[4][0]="true";
		obj[5][0]="false";
		obj[6][0]="true";
		obj[7][0]="false";
		obj[8][0]="true";
		obj[9][0]="false";
		return obj;
	}
	
}
