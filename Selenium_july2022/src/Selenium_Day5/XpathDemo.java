package Selenium_Day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {

	public static void main(String[] args) 
	{
				WebDriver driver = new ChromeDriver();
				driver.get("https://utkarshaaacademy.com/");
				
				driver.manage().window().maximize();
				
				// Absolute XPath
			//	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/nav/ul/li[5]/a")).click();
			
			//	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[1]/div/form/div/div[1]/div[1]/input")).sendKeys("Ravi");
			
				// Relative XPath
				
				// Syntax
				//tagname[@attribute='attribute value']
				
				driver.findElement(By.xpath("//nav//a[@title='Automation Practice']")).click();
				
				driver.findElement(By.xpath("//input[@id='name-firstname']")).sendKeys("Ravi");
				
				driver.findElement(By.xpath("//input[@id='name-lastname']")).sendKeys("Nangare");
				
				driver.findElement(By.xpath("//input[@name='field-phone[value]']")).sendKeys("8830158607");
				
				driver.findElement(By.xpath("//input[@class='coblocks-field coblocks-field--email']")).sendKeys("ravinangre@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='date']")).sendKeys("03-12-2022");
				
				driver.findElement(By.xpath("//input[@id='time-afternoon']")).click();
				
				driver.findElement(By.xpath("//textarea[@id='special-notes']")).sendKeys("I want to connect 2 pm for mock");
				
				driver.findElement(By.xpath("//button[@class='wp-block-button__link']")).click();
				
				driver.close();
			}

		
		
	}



