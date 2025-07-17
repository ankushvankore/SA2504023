package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D10POM_Client{
	WebDriver driver;
	RediffRegistrationUtility r1;
	
	@Test
	public void registration() {
		r1.setFullName("Joginder Singh");
		r1.setRediffId("jogindersingh");
		r1.setPassword("joginder123");
		r1.retypePassword("joginder123");
		r1.setBirthDate("06", "NOV", "1993");
	}
	
	@Test
	public void registration1()
	{
		r1.setFullName("Priya");
		r1.setRediffId("priya");
		r1.setPassword("priya123");
		r1.retypePassword("priya123");
		r1.setBirthDate("21", "OCT", "2000");
	}
	@BeforeMethod
	public void refreshPage()
	{
		driver.navigate().refresh();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        r1 = new RediffRegistrationUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
