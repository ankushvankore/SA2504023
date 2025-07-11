package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.id("prompt")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("lauren");
        Thread.sleep(5000);
        alert.accept();
        

	}

}
