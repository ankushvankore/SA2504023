package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
	@Test
	public void revenueCalculator() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	
	public void trial()
	{
		System.out.println("Trial Method");
	}
}
