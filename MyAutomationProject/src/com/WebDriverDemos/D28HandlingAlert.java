package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		Alert alt;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)", "");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();		//Will click on Ok button
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("timerAlertButton")).click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
		WebElement confirmButton = driver.findElement(By.id("confirmButton"));
		js.executeScript("arguments[0].click()", confirmButton);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();			//Click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		//WebElement promptButtton = driver.findElement(By.id("promtButton"));
		//js.executeScript("arguments[0].click()", promptButtton);
		js.executeAsyncScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		//alt = driver.switchTo().alert();
		//alt.sendKeys("Anushka");
		//alt.accept();
		
		driver.switchTo().alert().sendKeys("Megha");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
	}

}
