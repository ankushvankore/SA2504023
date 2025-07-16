package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistrationUtility {
	protected static WebDriver driver;
	
	public void setFullName(String fn)
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
	}
	public void setRediffId(String rid)
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
	}
	public void setPassword(String ps)
	{
		driver.findElement(By.id("newpasswd")).sendKeys(ps);
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
