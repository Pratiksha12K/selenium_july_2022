package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfor_Starts
{
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
        driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Automation")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'name-fir')]")).sendKeys("Pratiksha");
		driver.findElement(By.xpath("//input[starts-with(@id,'name-l')]")).sendKeys("Kadam");
		driver.findElement(By.xpath("//input[starts-with(@id,'ph')]")).sendKeys("963251481");
		driver.findElement(By.xpath("//input[starts-with(@name,'field-email[value]')]")).sendKeys("kadampratu30@gmail.com ");
		driver.findElement(By.xpath(" //input[starts-with(@type,'date')]")).sendKeys("11/12/1998");
		driver.findElement(By.xpath("//input[starts-with(@value,'M')]")).click();
		driver.findElement(By.xpath("  //textarea[starts-with(@id,'special')]")).sendKeys("I can speck in english");
	//	driver.findElement(By.xpath(" //button[starts-with(@class,'wp-block')]")).click();
		
		//text function in Xpath//
		//driver.findElement(By.xpath("//button[text()='Book Appointment']")).click();
		
		//text with contains function in Xpath//
		driver.findElement(By.xpath("//button[contains(text(),'Book')]")).click();
		
		
	}

}
