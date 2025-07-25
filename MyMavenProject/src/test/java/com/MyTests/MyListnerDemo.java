package com.MyTests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListnerDemo extends D07ForListners implements ITestListener 
{
	public void onStart(ITestContext result)
	{
		System.out.println("Test Started!!!");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Ended!!!");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + " Test Fail");
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, new File("GoogleSS.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() + " Test Skipped");
		System.out.println(result.getThrowable().toString());
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + " Test Success");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
