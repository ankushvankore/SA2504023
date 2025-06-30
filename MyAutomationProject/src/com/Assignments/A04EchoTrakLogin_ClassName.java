package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A04EchoTrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("megha");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("megha123");
		WebElement loginBtn = driver.findElement(By.className("btn-block"));
		loginBtn.click();

		WebElement errorMsg = driver.findElement(By.id("lblMsg"));
		String msg = errorMsg.getText();
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}

}
