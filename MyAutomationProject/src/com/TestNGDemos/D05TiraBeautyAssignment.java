package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05TiraBeautyAssignment {
	WebDriver driver;
	
	@Test(priority = 1, groups = "Women")
	public void testMakeUpLink() {
		driver.findElement(By.linkText("Makeup")).click();
	}
	@Test(priority = 2, groups = "Men")
	public void testSkinLink() {
		driver.findElement(By.linkText("Skin")).click();
	}
	@Test(priority = 3, groups = "Men")
	public void testMenLink() {
		driver.findElement(By.linkText("Men")).click();
	}
	@Test(groups = "Women")
	public void testMomnBabyLink() {
		driver.findElement(By.linkText("Mom & Baby")).click();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.tirabeauty.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("URL: " + driver.getCurrentUrl());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
