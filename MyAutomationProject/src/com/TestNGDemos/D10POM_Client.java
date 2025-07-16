package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client extends RediffRegistrationUtility{
	//WebDriver driver;
	RediffRegistrationUtility r1;
	
	@Test
	public void registration() {
		r1.setFullName("Joginder Singh");
		r1.setRediffId("jogindersingh");
		r1.setPassword("joginder123");
		r1.retypePassword("joginder123");
		r1.setBirthDate("06", "NOV", "1993");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        r1 = new RediffRegistrationUtility();
	}

	@AfterTest
	public void afterTest() {
	}

}
