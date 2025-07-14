package com.WebDriverDemos;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07AssertionDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		actUrl = driver.getCurrentUrl();

		//Assert.assertEquals(actUrl, expUrl, "Invalid credentials");
		Assert.assertTrue(actUrl.contains("dash"), "Invalid credentials");
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "vrushali", "vrushali123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "ayushi", "ayushi123" },
			new Object[] { "admin", "admin123" },
		};
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login successful\nTest case pass");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
		else
		{
			System.out.println("Login failed because of");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
		}
	}

	@BeforeTest
	public void beforeTest() {
		Map<String, Object>pref = new HashMap<>();
		pref.put("profile.credentials_enable_serve", false);
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", pref);

		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
