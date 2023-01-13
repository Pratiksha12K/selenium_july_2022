package Selenium_Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynAlertDemo {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		//Explicit Wait Provided by Selenium//
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Pratiksha");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to facebook')");
		
		Wait.until(ExpectedConditions.alertIsPresent()).accept();
	
	}

}
