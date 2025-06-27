package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		//Launch the browser
		driver.manage().window().maximize();		//Maximize
		
		driver.get("https://www.google.com/");		//Load the URL
		
		driver.close();								//Close the browser
	}

}
