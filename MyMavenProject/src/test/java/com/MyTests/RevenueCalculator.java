package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RevenueCalculator {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		Actions act = new Actions(driver);
		
		WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));
		//act.dragAndDropBy(slider, slider.getLocation().x + 10, slider.getLocation().y).perform();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)", "");
		
		for(int i = 1; i < 50; i++)
			slider.sendKeys(Keys.RIGHT);
	}

}
