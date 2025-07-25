package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyTests.MyListnerDemo.class)
public class D07ForListners {
	protected static WebDriver driver;
	@Test
	public void testForPass() {
		System.out.println("Test to be pass");
		Assert.assertTrue(true);
	}
	@Test
	public void testForFail() {
		System.out.println("Test to be fail");
		Assert.assertTrue(false);
	}
	@Test
	public void testForSkip() {
		System.out.println("Test to be skipped");
		new SkipException("Trial method for skip");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.close();
	}

}
