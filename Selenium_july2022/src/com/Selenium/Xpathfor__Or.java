
package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfor__Or 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='fail'or@id='email']")).sendKeys("pratikshakadam15@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass'or@id='_']")).sendKeys("pratu23466");
		driver.findElement(By.xpath("//button[@value='1'or name='']")).click();
		
		
	}

}
