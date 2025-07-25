package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S07DemoQARegistration {
	WebDriver driver;
	
	@Given("Launch DemoQA using link {string}")
	public void launch_demo_qa_using_link(String url) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("Enter {string} {string} {string} and {string}")
	public void enter_and(String fn, String ln, String eid, String gn) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 300)", "");
	    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(fn);
	    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(ln);
	    driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(eid);
	    if(gn.equals("Male"))
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]")));
	    else
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"gender-radio-2\"]")));
	    Thread.sleep(2000);
	}

	@When("Select {string} and {string}")
	public void select_and(String state, String city) {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 500)", "");
	    driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]")).click();
	    driver.findElement(By.xpath("//div[contains(text(), '"+state+"')]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
	    driver.findElement(By.xpath("//div[contains(text(), '"+city+"')]")).click();
	}

	@Then("Registration process is completed")
	public void registration_process_is_completed() {
	    System.out.println("Thanks for registration!!!");
	}
}
