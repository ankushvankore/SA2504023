package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistrationUtility {
	WebDriver driver;
	
	@FindBy (xpath = "//input[@placeholder='Enter your full name']") WebElement fullName;
	@FindBy (xpath = "//input[@placeholder=\"Enter Rediffmail ID\"]") WebElement rediffId;
	@FindBy (id = "newpasswd") WebElement password;
	
	
	public RediffRegistrationUtility(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void setFullName(String fn)
	{
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void setRediffId(String rid)
	{
		//driver.findElement(By.xpath("//input[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
		rediffId.sendKeys(rid);
	}
	public void checkAvailablity() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class='info']")).getText());
	}
	public void setPassword(String ps)
	{
		//driver.findElement(By.id("newpasswd")).sendKeys(ps);
		password.sendKeys(ps);
	}
	public void retypePassword(String rps)
	{
		driver.findElement(By.id("newpasswd1")).sendKeys(rps);
	}
	public void setBirthDate(String day, String month, String year)
	{
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"))).selectByContainsVisibleText(day);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"))).selectByContainsVisibleText(month);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"))).selectByContainsVisibleText(year);
		
	}
}
