package Selenium_Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SynImplicitWait
{
	public static void main(String[] args)                         //Dynamic Wait//
	{
        WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account'] ")).click();
		
		//Dynamic Wait provided By Selenium// use this
		//implicit wait provided by selenium //
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pratiksha");
		
		
	}

}
