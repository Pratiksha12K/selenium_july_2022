package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SelectortextString 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
	     driver.findElement(By.partialLinkText("Automation")).click();
	     driver.findElement(By.id("name-firstname")).sendKeys("Pratiksha");	    
		driver.findElement(By.cssSelector("input[id^='ph']")).sendKeys("9604428473");
		
	}

}
