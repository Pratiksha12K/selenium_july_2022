package Selenium_Day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SelectorDemo
{

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.utkarshaaacademy.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("Automation")).click();
			
			// Css Selector
			
			driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Ravi");
			
		//	driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Ravi");
			
		//	driver.findElement(By.cssSelector("input[id='name-firstname']")).sendKeys("Ravi");
			
		//	driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Nangare");
			
			driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Nangare");
			
			driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("8830158607");
			
			driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
			

		}

	

}
