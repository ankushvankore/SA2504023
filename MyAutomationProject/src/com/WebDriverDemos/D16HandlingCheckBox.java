package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D16HandlingCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement chkBox = driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
		System.out.println("Before");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Visible : " + chkBox.isDisplayed());
		
		if(chkBox.isSelected() == false)
			chkBox.click();
		
		System.out.println("After");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Visible : " + chkBox.isDisplayed());
	}

}
