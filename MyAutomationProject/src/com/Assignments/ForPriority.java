package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForPriority {
	
	@Test(priority = 0)
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority = 3, groups = "Men")
	public void test3() {
		System.out.println("test 3");
	}
	@Test(priority = 1, groups = "Women")
	public void test4() {
		System.out.println("test 4");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
	}
}
