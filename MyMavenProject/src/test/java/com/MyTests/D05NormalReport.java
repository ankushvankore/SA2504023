package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05NormalReport {

	public static void main(String[] args) throws InterruptedException {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("Reports\\MySimpleReport.html");
		//File that stores the report
		ExtentReports report = new ExtentReports();
		//This object represents the report
		report.attachReporter(htmlReport);
		//Store this report in the specified file
		
		ExtentTest test;
		//This object represents the tests those you are going to execute
		
		//Environment details for your report
		report.setSystemInfo("Machine", "Dell Laptop");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("User", "Aditya");
		report.setSystemInfo("Browser", "Google Chrome");
		
		//Configure look and feel of report
		htmlReport.config().setDocumentTitle("My First Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		test = report.createTest("Google title test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google Title: Pass", ExtentColor.GREEN));
		
		test = report.createTest("Google Search test");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Kishor Kumar", Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search: Fail", ExtentColor.RED));
		
		driver.close();
		
		report.flush();		//This method will generate the report
	}

}
