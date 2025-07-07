package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D27HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)", "");
		//Will scroll the browser window vertically by 100 pixels
		
		driver.findElement(By.xpath("//span[contains(text(), \"Remote\")]")).click();
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		//System.out.println(windows);
		Iterator<String>itr = windows.iterator();
		//Iterator is an interface which is used to iterate or read elements one by one from collection
		//espically from Set<>
		String win1 = itr.next();	//Will return 1st element
		String win2 = itr.next();	//Will return 2nd element
		
		//System.out.println(win1);
		//System.out.println(win2);
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
