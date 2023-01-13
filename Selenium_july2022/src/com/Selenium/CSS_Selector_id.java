package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_id {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Automation")).click();
		
		//CSS Selector
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Pratiksha");
		//driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Pratiksha");
	     // driver.findElement(By.cssSelector( "input[id='name=firstname']")).sendKeys("pratiksha");//No SuchElementException


	}

}
