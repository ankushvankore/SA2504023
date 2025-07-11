package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;
	
	@Test(priority = 4)
	public void testMaccaron() {
		driver.get("https://www.maccaron.in/en/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test(priority = 2)
	public void testTeraBeauty() {
		driver.get("https://www.tirabeauty.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test(priority = 3)
	public void testNyka() {
		driver.get("https://www.nykaa.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test(priority = 1)
	public void testSkinbae() {
		driver.get("https://www.skinbae.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After Test");
	}
}
