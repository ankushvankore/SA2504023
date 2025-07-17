package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D09KeywordDrivenFramework {
	File f1;
	FileInputStream fis;
	Properties prop;
	
	WebDriver driver;
	
	@Test
	public void testElements() {
		driver.findElement(By.id(prop.getProperty("nameTBId"))).sendKeys("Anushka");;
		driver.findElement(By.cssSelector(prop.getProperty("emailCss"))).sendKeys("anushka@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("phoneXPath"))).sendKeys("9898989898");
		driver.findElement(By.xpath(prop.getProperty("addressXpath"))).sendKeys("Ludhiana");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		f1 = new File("src/com/TestNGDemos/TestAutomationLocators.properties");
		fis = new FileInputStream(f1);
		prop = new Properties();
		prop.load(fis);
		//Load all the properties from .properties file in prop object
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
	}

}
