package com.WebDriverDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D34RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");

		driver.findElement(By.partialLinkText("Auto")).click();
		driver.findElement(By.partialLinkText("Insurant Data")).click();
		driver.findElement(By.id("open")).click();
		
		Robot rbt = new Robot();
		
		for(int i = 1; i <= 9; i++)
		{
			Thread.sleep(500);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_TAB);
		
		for(int i = 1; i <= 4; i++)
		{
			Thread.sleep(500);
			rbt.keyPress(KeyEvent.VK_DOWN);
		}
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_ENTER);
	}

}
