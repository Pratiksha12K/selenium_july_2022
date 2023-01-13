package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForContains
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Automation")).click();
		driver.findElement(By.xpath("//input[contains(@class,'first')]")).sendKeys("Pratiksha");
        driver.findElement(By.xpath("//input[contains(@class,'last')]")).sendKeys("Kadam");
        driver.findElement(By.xpath("//input[contains(@name,'field-phone[value]')]")).sendKeys("9604428473");
        driver.findElement(By.xpath("//input[contains(@class,'field--email')]")).sendKeys("kadampratiksha1203@gmail.com");
        driver.findElement(By.xpath("//input[contains(@id,'date')]")).sendKeys("12/03/1998");
        driver.findElement(By.xpath("//input[contains(@id,'afternoon')]")).click();
        driver.findElement(By.xpath("//textarea[contains(@class,'textarea')]")).sendKeys("I want to Attends 3pm english class.");
        driver.findElement(By.xpath("//button[contains(@class,'wp-block-button')]")).click();
        
        driver.close();
	}
		
	

}
