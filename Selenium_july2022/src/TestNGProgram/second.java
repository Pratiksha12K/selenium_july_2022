package TestNGProgram;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second {
	 
	public WebDriver driver;
	@Test
	public void launchTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9604428473");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123458");
		driver.findElement(By.xpath("//button")).click();
	}
}
