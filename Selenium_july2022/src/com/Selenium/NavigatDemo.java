package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatDemo
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.utkarshaaacademy.com");
		
		//Navigate Commands
		driver.navigate().to("https://www.facebook.com");
		 	
		}

}
