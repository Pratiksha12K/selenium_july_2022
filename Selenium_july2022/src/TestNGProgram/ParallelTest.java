package TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ParallelTest {
		public WebDriver driver;
	  @Test
	  public void ChromeTest() {
		  driver =new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys("ravinangre@gmail.com");
		  PassWord.sendKeys("123432134");
		  LoginBtn.click();
	  }
	  @Test
	  public void EdgeTest() {
		  driver =new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys("ravinangre@gmail.com");
		  PassWord.sendKeys("123432134");
		  LoginBtn.click();
	}
	  @Test
	  public void FireFoxTest() {
		  driver =new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys("ravinangre@gmail.com");
		  PassWord.sendKeys("123432134");
		  LoginBtn.click();
	}
}
