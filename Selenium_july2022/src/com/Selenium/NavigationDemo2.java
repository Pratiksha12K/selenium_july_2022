package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo2 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		//below Command for maximize the window 
		driver.manage().window().maximize();
		String URL=("htttp://www.utkarshaaacademy.com");
		driver.get("https://www.facebook.com");
		
		driver.navigate().to(URL);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		

	}

}
