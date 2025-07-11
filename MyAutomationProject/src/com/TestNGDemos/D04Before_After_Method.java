package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void displayTitle()
	{
		System.out.println("Title: " + driver.getTitle());
	}
	
	@Test(priority = 4)
	public void testMaccaron() {
		driver.get("https://www.maccaron.in/en/");
	}

	@Test(priority = 2)
	public void testTeraBeauty() {
		driver.get("https://www.tirabeauty.com/");
	}

	@Test(priority = 3)
	public void testNyka() {
		driver.get("https://www.nykaa.com/");
	}

	@Test(priority = 1)
	public void testSkinbae() {
		driver.get("https://www.skinbae.in/");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("After Test");
	}
}
