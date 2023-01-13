package Selenium_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMenu
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//CSS Selector Method//
		driver.get("https://demoqa.com/select-menu");
	 // driver.findElement(By.cssSelector("select>option:nth-of-type(5)")).click();
		driver.findElement(By.cssSelector("select>option:nth-of-type(10)")).click();
		
	}

}
