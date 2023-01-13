package Selenium_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchEx1 
{
	public static void main(String[] args) 
	{
		//System.out.println("webdriver.chrome.driver","D:\\chrome driver\\chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		//String UtkarshaaURL="https://www.utkarshaaacademy.com";
		//driver.get(UtkarshaaURL);
		driver.get("https://www.utkarshaaacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
	}

}
