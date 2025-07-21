package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D02TrialTestNGClass {
	WebDriver driver;
	@Test (invocationCount = 5)
	public void myTest() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Maven Dependency", Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
