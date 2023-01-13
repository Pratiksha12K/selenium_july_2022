package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("nav-link")).click();//this is not worked
		//driver.findElement(By.linkText("Automation Practice")).click();
		driver.findElement(By.partialLinkText("Automation")).click();
		//* when findElement ins not present in the list that time they show (No SuchElements Exeption)*//
		//driver.findElement(By.partialLinkText("AUtomation")).click();//
		
		
	
	//	driver.findElement(By.linkText("Seartch")).click();
		driver.findElement(By.id("name-firstname")).sendKeys("Pratiksha");
		driver.findElement(By.id("name-lastname")).sendKeys("Kadam");
		//driver.findElement(By.id("phone")).sendKeys("9604428473");
	//	driver.findElement(By.className("coblocks-field coblocks-field--telephone")).sendKeys("9604428473");//Space is Invalid
		driver.findElement(By.className("coblocks-field--telephone")).sendKeys("9604428473");
		driver.findElement(By.name("field-email[value]")).sendKeys("kadampratiksha15@gmail.com");
		driver.get("https://www.facebook.com");
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.tagName("button")).click();
		
	List<WebElement>links=	driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	//*When findElements not present in list that time they show 0(zero) or Empty List*//
	//List<WebElement>links=	driver.findElements(By.tagName("a1"));
	//System.out.println(links.size());
		
	List<WebElement>image=	driver.findElements(By.tagName("img"));
	System.out.println(image.size());
	
	List<WebElement>divs=	driver.findElements(By.tagName("div"));
	System.out.println(divs.size());
		 
		
		
	}

}
