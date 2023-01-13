package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_otherAttribute 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.manage().window().maximize();
       driver.findElement(By.partialLinkText("Automation")).click();
		
		//CSS Selector
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Pratiksha");
		
		driver.findElement(By.cssSelector(".coblocks-field.coblocks-field--name.last")).sendKeys("Kadam");
		
		driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("960448243");
		
		driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
		
		
	}
}

