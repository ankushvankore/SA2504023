package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D29HandlingFileUplad {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Ankush");
		driver.findElement(By.id("lastName")).sendKeys("Vankore");
		driver.findElement(By.id("userEmail")).sendKeys("ankushvankore@gmail.com");
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-1")));
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("29 Jan 1979");
		
		//File Upload
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\513757687_24203542745907599_8654082450370961417_n.jpg");
	}

}
