package com.mvn.genericlibraries;

import java.util.concurrent.TimeUnit;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ResultListener extends Baseclass implements ITestListener {
	//TimeUnit.MILLISECONDS.convert(value, TimeUnit.NANOSECONDS);

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult fail) {
		System.out.println("testcase ----- fail");

		CodetoExcel code = new CodetoExcel();

		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long value = endTime - startTime;
		long convertedtime=value/10^5;
		String time = String.valueOf(convertedtime);
		String failedtest = fail.getMethod().getMethodName();
		try {
			code.sendToExcel("Sheet1", row, 1, "fail");
			code.sendToExcel("Sheet1", row, 2, time +"ms");
		} catch (Exception e) {
		}
		row++;
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult m) {
		// TODO Auto-generated method stub
		String method = m.getMethod().getMethodName();

		CodetoExcel code = new CodetoExcel();
		try {
			code.sendToExcel("Sheet1", 0, 0, "Testcase");
			code.sendToExcel("Sheet1", 0, 1, "Status");
			code.sendToExcel("Sheet1", 0, 2, "Time duration");
			code.sendToExcel("Sheet1", row, 0, method);

		} catch (Exception e) {
		}
	}

	@Override
	public void onTestSuccess(ITestResult pass) {
		CodetoExcel code = new CodetoExcel();
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long value = endTime - startTime;
		long convertedtime=value/10^5;
		String time = String.valueOf(convertedtime);
		String success = pass.getMethod().getMethodName();
		try {
			System.out.println("testcase pass");

			code.sendToExcel("Sheet1", row, 1, "pass");
			code.sendToExcel("Sheet1", row, 2, time + "ms");
		} catch (Exception e) {
		}
		row++;
	}
}
