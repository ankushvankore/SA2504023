package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	}
	
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
		};
	}
	
	@AfterMethod
	public void afterMethod() {
	}

	
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
