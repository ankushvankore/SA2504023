package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03LoginToOHRM {
	WebDriver driver;
	@Given("Launch Orange HRM site")
	public void launch_orange_hrm_site() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	//Valid Data
	
	@When("I Enter valid userName")
	public void i_enter_valid_user_name() {
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

	@When("I Enter valid password")
	public void i_enter_valid_password() {
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

	@When("I Click on Login button")
	public void i_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Then("Dashboard page should display")
	public void dashboard_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}

	//Invalid Data

	@When("I Enter invalid userName")
	public void i_enter_invalid_user_name() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("aditya");
	}

	@When("I Enter invalid password")
	public void i_enter_invalid_password() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("aditya123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText().contains("Invalid"));
	}

}
