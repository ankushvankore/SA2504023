package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02OnlineShopping {
	@Test(priority = 4)
	public void testMaccaron() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.maccaron.in/en/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test(priority = 2)
	public void testTeraBeauty() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tirabeauty.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test(priority = 3)
	public void testNyka() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.nykaa.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test(priority = 1)
	public void testSkinbae() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.skinbae.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
