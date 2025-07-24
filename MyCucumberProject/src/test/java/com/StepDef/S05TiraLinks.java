package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S05TiraLinks {
	WebDriver driver;
	
	@Before
	public void launchBrowser()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.tirabeauty.com/");
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Given("Open the site {string}")
	public void open_the_site(String url) {
		
	}

	@When("I Click on Makeup Link")
	public void i_click_on_makeup_link() {
	    driver.findElement(By.linkText("Makeup")).click();
	}

	@Then("Makepup page should display")
	public void makepup_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("makeup"));
	}

	@When("I Click on Skin Link")
	public void i_click_on_skin_link() {
		driver.findElement(By.linkText("Skin")).click();
	}

	@Then("Skin page should display")
	public void skin_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("skin"));
	}

	@When("I Click on Men Link")
	public void i_click_on_men_link() {
		driver.findElement(By.linkText("Men")).click();
	}

	@Then("Men page should display")
	public void men_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("men"));
	}

	@When("I Click on Mom & Baby Link")
	public void i_click_on_mom_baby_link() {
		driver.findElement(By.partialLinkText("Mom")).click();
	}

	@Then("Mom & Baby page should display")
	public void mom_baby_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mom"));
	}
}
