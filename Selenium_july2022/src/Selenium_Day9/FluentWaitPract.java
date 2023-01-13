package Selenium_Day9;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitPract {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties" );
		
		WebElement colorChangeBtn= driver.findElement(By.xpath("//button[@id='colorChange']"));
		WebElement enableAfterBtn= driver.findElement(By.xpath("//button[@id='enableAfter']"));
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		System.out.println("Before visible After Button show as"+colorChangeBtn.getCssValue("color"));
		
		Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
		   .withTimeout(Duration.ofSeconds(20))
		   .pollingEvery(Duration.ofSeconds(5))
		   .ignoring(TimeoutException.class);
		
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id='visibleAfter1']")));
		WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		System.out.println(VisibleAfterBtn.isDisplayed());
		
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		System.out.println("Before visible After Button show as"+colorChangeBtn.getCssValue("color"));
		
	}
 
}
