package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_PriorityTest {
	public WebDriver driver;
	String pageTitle = "Utkarshaa academy";
  @Test(priority = -3)
  public void Starting_point() {
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  
  }
  @Test(priority = -2)
  public void checkTitle() {
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, pageTitle);
	  System.out.println("Test Pass");
  }
  @Test(priority = -1)
  public void clickonElement() {
	  driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @Test
  public void insert_data() {

	    driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Nangare");
		driver.findElement(By.cssSelector("input[id*='ho']")).sendKeys("8830158607");
		driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("ravinangre@gmail.com");
  }
}
