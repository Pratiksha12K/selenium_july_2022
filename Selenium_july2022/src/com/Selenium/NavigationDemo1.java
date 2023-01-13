package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		      //Navigation Commands
		driver.navigate().to("https://www.utkarshaaacademy.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		
	}

}
