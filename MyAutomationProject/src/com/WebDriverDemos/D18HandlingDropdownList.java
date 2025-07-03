package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		//All the operations on dropdown list will be handled via this object
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total Elements: " + countryList.size());
		
		/*int i = 0;
		for(WebElement c : countryList)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}*/
		
		//countries.selectByVisibleText("Canada");
		//countries.selectByValue("37");
		//countries.selectByContainsVisibleText("Can");
		countries.selectByIndex(35);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
	}

}
