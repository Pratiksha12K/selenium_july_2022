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
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		     //Implicit Wait //
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		     // Explicit Web driver Wait //
		WebDriverWait Wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		    // Explicit Fluent wait //
		Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement colorChangeBtn =  driver.findElement(By.xpath("//button[@id='colorChange']"));
		WebElement enableAfterBtn =driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		System.out.println("Before visible After Button show color as "+colorChangeBtn.getCssValue("color"));
		
	
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
	//	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter1']")));

		WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
	//	WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter1']"));

	//  System.out.println(VisibleAfterBtn.isDisplayed());
		System.out.println("Visible After Button is displayed after 5 seconds"+VisibleAfterBtn.isDisplayed());
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		System.out.println("Before visible After Button show color as "+colorChangeBtn.getCssValue("color"));
		
		
	


	}


}
