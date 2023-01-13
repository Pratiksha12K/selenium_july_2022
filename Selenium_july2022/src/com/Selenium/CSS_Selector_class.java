package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_class
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.manage().window().maximize();
       driver.findElement(By.partialLinkText("Automation")).click();
		
		//CSS Selector
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Pratiksha");
		
		//driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Kadam");
		//driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Kadam");
		driver.findElement(By.cssSelector(".coblocks-field.coblocks-field--name.last")).sendKeys("Kadam");
		
		

		
		
	}

}
