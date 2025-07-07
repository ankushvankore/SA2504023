package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
		
		driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]/div[1]/div[1]/span")).sendKeys("aaa");
		
		//driver.close();
	}

}
