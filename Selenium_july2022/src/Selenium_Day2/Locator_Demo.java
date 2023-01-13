package Selenium_Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Demo 
{
	
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.utkarshaaacademy.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("Automation")).click();
			
			driver.findElement(By.id("name-firstname")).sendKeys("Ravi");
			
			driver.findElement(By.id("name-lastname")).sendKeys("Nangare");
			
			driver.findElement(By.className("coblocks-field--telephone")).sendKeys("8830158607");
			
			driver.findElement(By.name("field-email[value]")).sendKeys("ravinangre@gmail.com");
			
			driver.get("https://www.facebook.com");
			
			//driver.findElement(By.linkText("Log in")).click();
			
			driver.findElement(By.tagName("button")).click();

		}

	

}
