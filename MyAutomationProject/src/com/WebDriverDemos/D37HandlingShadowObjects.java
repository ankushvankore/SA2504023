package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D37HandlingShadowObjects {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/?m=1");

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 900)", "");
        
        SearchContext ss = driver.findElement(By.xpath("//*[@id=\"shadow_host\"]")).getShadowRoot();
        ss.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Vrushali");
	}

}
