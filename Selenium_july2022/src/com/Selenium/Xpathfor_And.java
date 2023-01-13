package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfor_And {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email'and@name='email'] ")).sendKeys("pratikshakadam15@gmail.com");
		driver.findElement(By.xpath(" //input[@id='pass'and@name='pass']")).sendKeys("pratu23466");
		driver.findElement(By.xpath(" //button[@value='1'and @ name='login']")).click();
		
		
		

	}

}
