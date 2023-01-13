package TestNGProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Day9_CrossBrowserTest {
	public WebDriver  driver;
  @Test
  public void FBLogin() {
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys("pratikshakadam1203@gmail.com");
	  PassWord.sendKeys("pratu@123456");
	  LoginBtn.click(); 
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
	  }
	  driver.get("https://www.facebook.com/");
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
	  driver.quit();
  }

}
