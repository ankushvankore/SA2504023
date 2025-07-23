package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S01GoogleTitle {
	WebDriver driver;
	String actTitle;
	
	@Given("Open Google")
	public void open_google() {
	    System.out.println("Launching Google");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com");
	}

	@When("Read the title")
	public void read_the_title() {
		actTitle = driver.getTitle();
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
	    System.out.println("Title: " + actTitle);
	    Assert.assertTrue(actTitle.equals("Google"));
	}
}
