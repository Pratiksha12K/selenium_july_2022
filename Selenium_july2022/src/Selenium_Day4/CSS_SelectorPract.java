package Selenium_Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SelectorPract 
{
	public static void main(String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.utkarshaaacademy.com");
	
	//CSS Selector with Parent Child Relationship
	
	driver.findElement(By.cssSelector("nav>ul>li>a.nav-link[title='Automation Practice']")).click();
	
	// Css Selector
	
	driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Pratu");
	
        //	driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Pratu");
	
		//	driver.findElement(By.cssSelector("input[id='name-firstname']")).sendKeys("Pratu");
			
		//	driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Kadam");
			
	    driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Kadam");
	    
	    driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("960442843");
        
        driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
        
        //CSS Selector with combination
        
       // driver.findElement(By.cssSelector("input.coblocks-field--email#email")).sendKeys("kadampratiksha15@gmail.com");
        
        //CSS Selector with id along other attribute
        
        driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("kadampratiksha15@gmail.com");
        
         driver.get("http://www.facebook.com");
         
         //driver.findElement(By.cssSelector("div._6ltg>button")).click();
         
         driver.findElement(By.cssSelector("div>button")).click();
         
         
	}
}
