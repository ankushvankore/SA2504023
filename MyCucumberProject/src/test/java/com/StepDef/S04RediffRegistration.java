package com.StepDef;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04RediffRegistration {
	WebDriver driver;
	
	@Given("Launch Rediff Registration Page")
	public void launch_rediff_registration_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("Enter full name as {string}")
	public void enter_full_name_as(String fullName) {
	    driver.findElement(By.xpath("//input[starts-with(@name, \"name\")]")).sendKeys(fullName);
	}

	@When("Enter rediff id as {string}")
	public void enter_rediff_id_as(String rId) {
	    driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys(rId);
	}

	@When("Enter password as {string}")
	public void enter_password_as(String pass) {
	    driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(pass);
	}

	@When("Retype password as {string}")
	public void retype_password_as(String pass) {
	    driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(pass);
	}
	@When("I Enter Birth date as")
	public void i_enter_birth_date_as(io.cucumber.datatable.DataTable dataTable) {
		List<String>data = dataTable.asList();
		String d = data.get(0);
	    String m = data.get(1);
	    String y = data.get(2);
	    
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Day\")]"))).selectByContainsVisibleText(d);
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Month\")]"))).selectByContainsVisibleText(m);
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Year\")]"))).selectByContainsVisibleText(y);
	}

	@When("Click on Check availablity")
	public void click_on_check_availablity() {
	    driver.findElement(By.xpath("//input[starts-with(@name, \"btnchkavail\")]")).click();
	}

	@Then("Rediff id available message should display")
	public void rediff_id_available_message_should_display() {
		String msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
		System.out.println(msg);
	    Assert.assertTrue(msg.contains("available"));
	}

	//Invalid data
	
	@When("Enter invalid full name as {string}")
	public void enter_invalid_full_name_as(String fullName) {
	    driver.findElement(By.xpath("//input[starts-with(@name, \"name\")]")).sendKeys(fullName);
	}

	@When("Enter invalid rediff id as {string}")
	public void enter_invalid_rediff_id_as(String rId) {
	    driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys(rId);
	}

	@When("Enter invalid password as {string}")
	public void enter_invalid_password_as(String pass) {
	    driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(pass);
	}

	@When("Retype invalid password as {string}")
	public void retype_invalid_password_as(String pass) {
	    driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(pass);
	}
	
	@When("Select Birth date as")
	public void select_birth_date_as(io.cucumber.datatable.DataTable dataTable) {
		List<String>data = dataTable.asList();
		String d = data.get(0);
	    String m = data.get(1);
	    String y = data.get(2);
	    
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Day\")]"))).selectByContainsVisibleText(d);
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Month\")]"))).selectByContainsVisibleText(m);
	    new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Year\")]"))).selectByContainsVisibleText(y);
	}


	@When("I Click on Check availablity")
	public void i_click_on_check_availablity() {
		driver.findElement(By.xpath("//input[starts-with(@name, \"btnchkavail\")]")).click();
	}

	@Then("Rediff id not available message should display")
	public void rediff_id_not_available_message_should_display() {
		String msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
		System.out.println(msg);
	    Assert.assertTrue(msg.contains("available"));
	}
}
