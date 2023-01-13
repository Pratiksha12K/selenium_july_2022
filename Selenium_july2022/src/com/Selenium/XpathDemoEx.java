package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoEx {

	public static void main(String[] args)
{
		WebDriver driver=new ChromeDriver();
		driver.get("https://utkarshaaacademy.com/");
		//Absolute X-path//
	//river.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/nav/ul/li[5]/a")).click();		
      
	//river.findElement(By.xpath("//input[@id='name-firstname']")).sendKeys("Pratiksha");
		
		
		  //Relative X-path//
		//syntax//
		//tagnmae[@attribute='attributes value]//
		
		driver.findElement(By.xpath("//nav//a[@title='Automation Practice']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name-firstname']")).sendKeys("Pratiksha");
		 driver.findElement(By.xpath("//input[@id='name-lastname']")).sendKeys("Kadam");
         driver.findElement(By.xpath("//input[@name='field-phone[value]']")).sendKeys("9604428473");
         driver.findElement(By.xpath("//input[@class=\"coblocks-field coblocks-field--email\"]")).sendKeys("kadampratu30@gmail.com");
         driver.findElement(By.xpath("//input[@id='date']")).sendKeys("03/12/2022");
    //   driver.findElement(By.xpath("//input[@id='time-morning']")).click();
         driver.findElement(By.xpath("//input[@id='time-afternoon']")).click();
         driver.findElement(By.xpath("//textarea[@id='special-notes']")).sendKeys("I want to connect 2 pm for mock");
         driver.findElement(By.xpath("//button[@class='wp-block-button__link']")).click();

         driver.close();
        		
}
}
