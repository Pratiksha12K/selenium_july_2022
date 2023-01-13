package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Day9_ParallelTest {
	
	public WebDriver driver;
  @Test
  public void ChromeTest() {
	  ChromeOptions coption = new ChromeOptions();
	  coption.addArguments("--headless");
	  driver =new ChromeDriver(coption);
	  System.out.println("The thread ID for Chrome is"+ Thread.currentThread().getId());
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys("kadampratu30@gmail.com");
	  PassWord.sendKeys("123432134");
	  LoginBtn.click();
  }
  @Test
  public void EdgeTest() {
	  EdgeOptions eoption = new EdgeOptions();
	  eoption.addArguments("--headless");
	  driver =new EdgeDriver(eoption);
	  System.out.println("The thread ID for Chrome is"+ Thread.currentThread().getId());
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys("kadampratu30@gmail.com");
	  PassWord.sendKeys("123432134");
	  LoginBtn.click();
}
}
