package Selenium_Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SyncStaticDemo {

	public static void main(String[] args) throws InterruptedException                //Static Wait//
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account'] ")).click();
		
		//Static wait provided by java//dont'n use this in Synchrom
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pratiksha");
	
	}

}
