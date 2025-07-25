package com.MyTests;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RediffTableAssignmnet {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>currentPrice = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		double[]cpArray = new double[currentPrice.size()];
		
		for(int i = 0; i < currentPrice.size(); i++)
		{
			String str = currentPrice.get(i).getText();
			str = str.replace(",", "");
			cpArray[i] = Double.parseDouble(str);
		}
		Arrays.sort(cpArray);
		System.out.println("Highest Price: " + cpArray[cpArray.length-1]);
		
		driver.close();
	}

}
