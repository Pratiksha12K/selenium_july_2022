package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Day10_ChromeTest {
	public WebDriver driver;
	  @Test(threadPoolSize = 2,invocationCount = 2,timeOut = 40000)
	  public void ChromeTest() {
//		  ChromeOptions coption = new ChromeOptions();
//		  coption.addArguments("--headless");
		  driver =new ChromeDriver();
		  System.out.println("The thread ID for Chrome is"+ Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
//		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
//		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
//		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
//		  UserName.sendKeys("kadampratu30@gmail.com");
//		  PassWord.sendKeys("123432134");
//		  LoginBtn.click();
	  }
}
