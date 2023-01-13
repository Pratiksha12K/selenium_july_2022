package Selenium_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Demo
{
		public static void main(String[] args)  {
		
			WebDriver driver = new ChromeDriver();
			
			// maximize the window
			driver.manage().window().maximize();
			
			String URL = "https://www.utkarshaaacademy.com";
			driver.get("https://www.facebook.com");
		
			// Navigation commands
		//	driver.navigate().to("https://www.utkarshaaacademy.com");
			
			driver.navigate().to(URL);
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
		
			driver.get("https://www.google.com");
			
			driver.close();
			

		}

	


}
